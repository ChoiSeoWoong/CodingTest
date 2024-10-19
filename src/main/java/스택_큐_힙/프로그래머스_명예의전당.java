package 스택_큐_힙;

import java.util.*;

public class 프로그래머스_명예의전당 {
    class Solution {
        public int[] solution(int k, int[] score) {
            int[] answer = new int[score.length];
            PriorityQueue<Integer> rank = new PriorityQueue<>();

            if(k > score.length) {
                for(int i = 0; i < score.length; i++) {
                    rank.add(score[i]);
                    answer[i] = Collections.min(rank);
                }

                return answer;
            }

            for(int i = 0; i < k; i++) {
                rank.add(score[i]);
                answer[i] = Collections.min(rank);
            }

            for(int i = k; i < score.length; i++) {
                int max = Collections.max(rank);
                int min = Collections.min(rank);

                if(max <= score[i]) {
                    rank.add(score[i]);
                    rank.poll();
                } else if(min < score[i] && score[i] < max) {
                    rank.add(score[i]);
                    rank.poll();
                } else {
                    answer[i] = min;
                    continue;
                }

                min = Collections.min(rank);
                answer[i] = min;
            }

            return answer;
        }
    }
}

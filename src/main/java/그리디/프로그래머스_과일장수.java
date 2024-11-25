package 그리디;

import java.util.*;

public class 프로그래머스_과일장수 {
    class Solution {
        public int solution(int k, int m, int[] score) {
            int answer = 0;
            int idx = 0;
            int length = score.length;
            Arrays.sort(score);

            for(int i = 0; i < score.length / m; i++) {
                int[] boxes = Arrays.copyOfRange(score, length - m, length);
                length -= m;

                if(length < 0) {
                    break;
                }

                answer += Arrays.stream(boxes).min().getAsInt() * m;

            }

            return answer;
        }
    }
}

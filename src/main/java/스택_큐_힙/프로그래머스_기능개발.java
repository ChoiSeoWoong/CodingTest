package 스택_큐_힙;

import java.util.*;

public class 프로그래머스_기능개발 {
    class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            Queue<Integer> answer = new LinkedList<>();
            Queue<Integer> queue = new LinkedList<>();
            int length = progresses.length;
            int dayCnt;
            int usualCnt;

            for(int i = 0; i < length; i++) {
                dayCnt = 0;
                while(progresses[i] < 100) {
                    progresses[i] += speeds[i];
                    dayCnt++;
                }
                queue.add(dayCnt);
            }

            while(!queue.isEmpty()) {
                int popData = queue.poll();
                usualCnt = 1;

                while(!queue.isEmpty() && popData >= queue.peek()) {
                    usualCnt++;
                    queue.poll();
                }
                answer.add(usualCnt);
            }

            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}

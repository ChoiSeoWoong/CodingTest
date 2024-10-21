package 그리디;

import java.util.*;

public class 프로그래머스_구명보트 {
    class Solution {
        public int solution(int[] people, int limit) {
            int answer = 0;
            List<Integer> al = new ArrayList<>();
            Deque<Integer> deque;

            for(int val : people) {
                al.add(val);
            }

            Collections.sort(al);
            deque = new ArrayDeque<>(al);

            while(!deque.isEmpty()) {
                int first = deque.peekFirst();
                int last = deque.peekLast();

                if(first + last > limit) {
                    deque.pollLast();
                    answer++;
                } else {
                    deque.pollFirst();
                    deque.pollLast();
                    answer++;
                }

                if(deque.size() == 1) {
                    answer++;
                    break;
                }
            }

            return answer;
        }
    }
}

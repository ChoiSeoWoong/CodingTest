package 스택_큐_힙;

import java.util.*;

public class 프로그래머스_카드뭉치 {
    class Solution {
        public String solution(String[] cards1, String[] cards2, String[] goal) {
            String answer = "Yes";
            Queue<String> queue1 = new LinkedList<>(Arrays.asList(cards1));
            Queue<String> queue2 = new LinkedList<>(Arrays.asList(cards2));

            for(int i = 0; i < goal.length; i++) {
                if(goal[i].equals(queue1.peek())) {
                    queue1.poll();
                } else if(goal[i].equals(queue2.peek())) {
                    queue2.poll();
                } else {
                    answer = "No";
                }
            }

            return answer;
        }
    }
}

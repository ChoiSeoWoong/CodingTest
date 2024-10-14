package 스택_큐_힙;

import java.util.*;

public class 프로그래머스_같은숫자는싫어 {
    public class Solution {
        public int[] solution(int []arr) {
            int[] answer = {};
            Stack<Integer> stackArray = new Stack();

            for(int i : arr) {
                if(stackArray.isEmpty()) {
                    stackArray.push(i);
                }

                else if(stackArray.peek() != i) {
                    stackArray.push(i);
                }
            }

            answer = new int[stackArray.size()];

            for(int i = answer.length - 1; i >= 0; i--) {
                answer[i] = stackArray.pop();
            }

            return answer;
        }
    }
}

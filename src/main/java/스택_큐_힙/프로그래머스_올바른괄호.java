package 스택_큐_힙;

import java.util.*;

public class 프로그래머스_올바른괄호 {
    class Solution {
        boolean solution(String s) {
            boolean answer = true;
            Stack<Character> stack = new Stack<>();

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(') {
                    stack.add(s.charAt(i));
                } else {
                    if(stack.isEmpty()) {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            }

            if(!stack.isEmpty()) {
                answer = false;
            }

            return answer;
        }
    }
}

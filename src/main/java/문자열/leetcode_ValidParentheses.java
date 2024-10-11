package 문자열;

import java.util.*;

public class leetcode_ValidParentheses {
    class Solution {
        public void isValidParenthesesAndPop(Stack<Character> stack, char c) {
            if(stack.peek() == '(' && c == ')') {
                stack.pop();
            } else if(stack.peek() == '[' && c == ']') {
                stack.pop();
            } else if(stack.peek() == '{' && c == '}') {
                stack.pop();
            } else {
                stack.add(c);
            }
        }

        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            if(s.length() % 2 == 1) {
                return false;
            }

            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if(c == '(' || c == '{' || c == '[') {
                    stack.add(c);
                } else {
                    if(stack.isEmpty()) {
                        return false;
                    }

                    isValidParenthesesAndPop(stack, c);
                }
            }

            return (stack.isEmpty())? true : false;
        }
    }
}

package 스택_큐_힙;

import java.util.*;

public class 프로그래머스_짝지어제거하기 {
    class Solution
    {
        public int solution(String s)
        {
            int answer = -1;
            Stack<Character> stack = new Stack<>();

            char[] charArr = s.toCharArray();

            for(int i = 0; i < charArr.length; i++) {
                if(!stack.isEmpty() && stack.peek() == charArr[i])
                    stack.pop();

                else
                    stack.push(charArr[i]);
            }


            return stack.isEmpty() ? 1 : 0;
        }
    }
}

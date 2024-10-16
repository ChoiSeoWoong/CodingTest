package 문자열;

import java.util.*;

public class 프로그래머스_숫자문자열과영단어 {
    class Solution {
        public int solution(String s) {
            int answer = 0;
            String[] engNum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

            for(int i = 0; i < engNum.length; i++) {
                s = s.replace(engNum[i], String.valueOf(i));
            }

            answer = Integer.parseInt(s);
            return answer;
        }
    }
}

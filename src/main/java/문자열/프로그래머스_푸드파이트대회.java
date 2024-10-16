package 문자열;

import java.util.*;

public class 프로그래머스_푸드파이트대회 {
    class Solution {
        public String solution(int[] food) {
            String answer = "";
            String zero = "";
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < food.length; i++) {
                if(i == 0) {
                    zero += "0";
                } else {
                    for(int k = 0; k < food[i] / 2; k++) {
                        sb.append(String.valueOf(i));
                    }
                }
            }

            answer += sb.toString();
            answer += zero;
            answer += sb.reverse().toString();

            return answer;
        }
    }
}

package 문자열;

import java.util.*;

public class 프로그래머스_이상한문자만들기 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            String[] arr = s.split("");

            boolean flag = true;

            for(int i = 0; i < arr.length; i++) {
                String str = arr[i];

                if(flag) {
                    answer += str.toUpperCase();
                } else {
                    answer += str.toLowerCase();
                }

                flag = !flag;

                if(str.equals(" ")) {
                    flag = true;
                }
            }

            return answer;
        }
    }
}

package 문자열;

import java.util.*;

public class leetcode_RomantoInteger {

    class Solution {
        public int romanToInt(String s) {
            Map<String, Integer> map = new HashMap<>();

            map.put("I", 1);
            map.put("V", 5);
            map.put("X", 10);
            map.put("L", 50);
            map.put("C", 100);
            map.put("D", 500);
            map.put("M", 1000);

            String[] arr = s.split("");
            int answer = 0;
            boolean flag = false;

            for(int i = 0; i < arr.length - 1; i++) {
                if(flag == true) {
                    flag = false;
                    continue;
                }

                if(arr[i].equals("I")) {
                    if(arr[i + 1].equals("V")) {
                        answer += 4;
                        flag = true;
                    } else if(arr[i + 1].equals("X")) {
                        answer += 9;
                        flag = true;
                    } else {
                        answer += map.get(arr[i]);
                    }
                } else if(arr[i].equals("X")) {
                    if(arr[i + 1].equals("L")) {
                        answer += 40;
                        flag = true;
                    } else if(arr[i + 1].equals("C")) {
                        answer += 90;
                        flag = true;
                    } else {
                        answer += map.get(arr[i]);
                    }
                } else if(arr[i].equals("C")) {
                    if(arr[i + 1].equals("D")) {
                        answer += 400;
                        flag = true;
                    } else if(arr[i + 1].equals("M")) {
                        answer += 900;
                        flag = true;
                    } else {
                        answer += map.get(arr[i]);
                    }
                } else {
                    if(map.containsKey(arr[i])) {
                        answer += map.get(arr[i]);
                    }
                }
            }

            if(!flag) {
                answer += map.get(arr[arr.length - 1]);
            }

            return answer;
        }
    }
}

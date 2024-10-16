package 문자열;

import java.util.*;

public class 프로그래머스_가장가까운같은글자 {
    class Solution {
        public int[] solution(String s) {
            int[] answer = new int[s.length()];
            Map<Character, Integer> hm = new HashMap<>();

            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if(hm.get(c) == null) {
                    hm.put(c, i);
                    answer[i] = -1;
                } else {
                    answer[i] = i - hm.get(c);
                    hm.put(c, i);
                }
            }

            return answer;
        }
    }
}

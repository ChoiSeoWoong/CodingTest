package 정렬;

import java.util.*;

public class 프로그래머스_문자열내마음대로정렬하기 {
    class Solution {
        public String[] solution(String[] strings, int n) {
            String[] answer = {};

            Arrays.sort(strings, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if(o1.charAt(n) == o2.charAt(n)) {
                        return o1.compareTo(o2);
                    } else {
                        return o1.charAt(n) - o2.charAt(n);
                    }
                }
            });

            return strings;
        }
    }
}

package 문자열;

import java.util.*;

public class leetcode_LongestCommonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            List<String> list = new ArrayList<>();
            int cnt = 0;

            Arrays.sort(strs, new Comparator<>() {
                @Override
                public int compare(String s1, String s2) {
                    if(s1.length() < s2.length()) {
                        return s1.compareTo(s2);
                    } else {
                        return s2.compareTo(s1);
                    }
                }
            });

            String s = strs[0];

            for(int i = 0; i < s.length(); i++) {
                String prefix = s.substring(0, i + 1);
                cnt = 0;

                for(String word : strs) {
                    if(word.startsWith(prefix)) {
                        cnt++;
                    }
                }

                if(cnt == strs.length) {
                    list.add(prefix);
                }
            }

            if(list.isEmpty()) {
                return "";
            }

            return list.get(list.size() - 1);
        }
    }
}

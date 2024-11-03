package 정렬;

import java.util.*;

public class 프로그래머스_HIndex {
    class Solution {
        public int solution(int[] citations) {
            int answer = 0;
            Arrays.sort(citations);

            for(int i = 0; i <= citations.length; i++) {
                int more = 0;

                for(int j = 0; j < citations.length; j++) {
                    if(i <= citations[j]) {
                        more++;
                    }
                }

                if(more >= i) {
                    answer = i;
                }
            }

            return answer;
        }
    }
}

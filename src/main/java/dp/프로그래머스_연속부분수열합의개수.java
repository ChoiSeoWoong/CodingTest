package dp;

import java.util.*;

public class 프로그래머스_연속부분수열합의개수 {
    class Solution {
        public int solution(int[] elements) {
            Set<Integer> set = new HashSet<>();
            int[] dp = new int[elements.length];

            for(int i = 1; i <= elements.length; i++) {
                for(int j = 0; j < elements.length; j++) {
                    dp[j] += elements[(i + j - 1) % elements.length];
                    // for(int k = 0; k < i; k++) {
                    //     if(j + k > elements.length - 1) {
                    //         sum += elements[j + k - elements.length];
                    //     } else {
                    //         sum += elements[j + k];
                    //     }
                    // }

                    set.add(dp[j]);
                }
            }

            return set.size();
        }
    }
}

package dp;

import java.util.*;

public class 프로그래머스_멀리뛰기 {
    class Solution {
        public long solution(int n) {
            long[] dp = new long[n + 1];

            if(n == 1) {
                return 1;
            }

            if(n == 2) {
                return 2;
            }

            dp[0] = 0;
            dp[1] = 1L;
            dp[2] = 2L;

            for(int i = 3; i <= n; i++) {
                dp[i] = (dp[i - 2] + dp[i - 1]) % 1234567;
            }

            return dp[n];
        }
    }
}

package dp;

import java.util.*;

public class leetcode_ClimbingStairs {
    class Solution {
        public int climbStairs(int n) {
            int[] dp = new int[46];

            dp[1] = 1;
            dp[2] = 2;

            for(int i =  3; i < dp.length; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

            return dp[n];
        }
    }
}

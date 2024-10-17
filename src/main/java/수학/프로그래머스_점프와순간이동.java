package 수학;

import java.util.*;

public class 프로그래머스_점프와순간이동 {
    public class Solution {
        public int solution(int n) {
            int ans = 0;

            while(n != 0) {
                if(n % 2 == 0) {
                    n /= 2;
                } else {
                    n--;
                    ans++;
                }
            }

            return ans;
        }
    }
}

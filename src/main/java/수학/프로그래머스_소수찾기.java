package 수학;

import java.util.*;

public class 프로그래머스_소수찾기 {
    class Solution {
        public boolean isPrimeNumber(int number) {
            for(int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i == 0) {
                    return false;
                }
            }

            return true;
        }

        public int solution(int n) {
            int answer = 0;

            for(int i = 2; i <= n; i++) {
                if(isPrimeNumber(i)) {
                    answer++;
                }
            }
            return answer;
        }
    }
}

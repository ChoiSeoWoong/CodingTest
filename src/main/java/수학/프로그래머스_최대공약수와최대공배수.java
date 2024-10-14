package 수학;

import java.util.*;

public class 프로그래머스_최대공약수와최대공배수 {
    class Solution {
        public int getGCD(int num1, int num2) {
            if(num1 % num2 == 0) {
                return num2;
            }

            return getGCD(num2, num1 % num2);
        }

        public int[] solution(int n, int m) {
            int[] answer = new int[2];
            int gcd = getGCD(n, m);
            int lcm = n * m / gcd;

            answer[0] = gcd;
            answer[1] = lcm;

            return answer;
        }
    }
}

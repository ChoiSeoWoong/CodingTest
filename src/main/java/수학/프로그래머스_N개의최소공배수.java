package 수학;

import java.util.*;

public class 프로그래머스_N개의최소공배수 {
    class Solution {
        public int getGCD(int num1, int num2) {
            if(num1 % num2 == 0) {
                return num2;
            }

            return getGCD(num2, num1 % num2);
        }

        public int solution(int[] arr) {
            int answer = 0;

            if(arr.length == 1) {
                return arr[0];
            }

            int gcd = getGCD(arr[0], arr[1]);
            int lcm = arr[0] * arr[1] / gcd;

            if(arr.length == 2) {
                return lcm;
            }

            for(int i = 2; i < arr.length; i++) {
                gcd = getGCD(lcm, arr[i]);
                lcm = lcm * arr[i] / gcd;
            }

            return lcm;
        }
    }
}

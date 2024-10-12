package 리스트와배열;

import java.util.*;
import java.math.*;

public class leetcode_plusone {
    class Solution {
        // public int[] plusOne(int[] digits) {
        //     StringBuilder sb = new StringBuilder();
        //     List<Integer> answer = new ArrayList<>();

        //     for(int i = 0; i < digits.length; i++) {
        //         sb.append(String.valueOf(digits[i]));
        //     }
        //     BigInteger one = new BigInteger("1");
        //     BigInteger digit = new BigInteger(sb.toString()).add(one);
        //     String[] arr = String.valueOf(digit).split("");

        //     for(String s : arr) {
        //         answer.add(Integer.parseInt(s));
        //     }

        //     return answer.stream().mapToInt(Integer::intValue).toArray();
        // }

        public int[] plusOne(int[] digits) {
            for(int i = digits.length - 1; i >= 0; i--) {
                if(digits[i] < 9) {
                    digits[i]++;

                    return digits;
                }

                digits[i] = 0;
            }

            digits = new int[digits.length + 1];
            digits[0] = 1;

            return digits;
        }
    }
}

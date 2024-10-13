package 문자열;

import java.math.*;

public class leetcode_AddBinary {
    class Solution {
        public String addBinary(String a, String b) {
            BigInteger x = new BigInteger(a, 2);
            BigInteger y = new BigInteger(b, 2);

            BigInteger result = x.add(y);
            return result.toString(2);
        }
    }
}

package 문자열;

public class leetcode_PalindromeNumber {
    class Solution {
        public boolean isPalindrome(int x) {
            StringBuilder sb = new StringBuilder();

            if(x < 0) {
                return false;
            }

            String strX = String.valueOf(x);
            sb.append(strX);

            if(sb.toString().equals(sb.reverse().toString())) {
                return true;
            } else {
                return false;
            }
        }
    }
}

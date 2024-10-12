package 문자열;

public class leetcode_LengthOfTheWord {
    class Solution {
        public int lengthOfLastWord(String s) {
            String[] arr = s.split(" ");

            return arr[arr.length - 1].length();
        }
    }
}

package 투포인터;

public class leetcode_TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] answer = new int[2];

            for(int i = 0; i < nums.length; i++) {
                for(int j = nums.length - 1; j >= 0; j--) {
                    if(i == j) {
                        break;
                    }

                    if(nums[i] + nums[j] == target) {
                        answer[0] = i;
                        answer[1] = j;
                    }
                }
            }

            return answer;
        }
    }
}

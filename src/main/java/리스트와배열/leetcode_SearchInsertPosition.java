package 리스트와배열;

import java.util.*;

public class leetcode_SearchInsertPosition {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            for(int i = 0; i < nums.length; i++) {
                if(target > nums[i]) {
                    continue;
                } else {
                    return i;
                }
            }

            return nums.length;
        }
    }
}

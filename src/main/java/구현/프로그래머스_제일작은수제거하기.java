package 구현;

import java.util.*;

public class 프로그래머스_제일작은수제거하기 {
    class Solution {
        public int[] solution(int[] arr) {
            List<Integer> answer = new ArrayList<>();
            int min = Integer.MAX_VALUE;

            if(arr.length == 1)
                return new int[] {-1};

            for(int i = 0; i < arr.length; i++) {
                min = Math.min(min, arr[i]);
            }

            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == min)
                    continue;

                answer.add(arr[i]);
            }

            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}

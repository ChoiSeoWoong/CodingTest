package 구현;

import java.util.*;

public class 프로그래머스_n제곱배열자르기 {
    class Solution {
        public int[] solution(int n, long left, long right) {
            List<Integer> answer = new ArrayList<>();

            for(long i = left; i <= right; i++) {
                long num = Math.max(i / n, i % n) + 1;
                answer.add((int)num);
            }

            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}

package 리스트와배열;

import java.util.*;

public class 프로그래머스_두개뽑아서더하기 {
    class Solution {
        public int[] solution(int[] numbers) {
            List<Integer> al = new ArrayList<>();

            for(int i = 0 ; i < numbers.length; i++) {
                for(int j = 0; j < numbers.length; j++) {
                    if(i != j) {
                        if(!al.contains(numbers[i] + numbers[j])) {
                            al.add(numbers[i] + numbers[j]);
                        }
                    }
                }
            }

            return al.stream().sorted().mapToInt(Integer::intValue).toArray();
        }
    }
}

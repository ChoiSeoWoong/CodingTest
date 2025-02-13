package 구현;

import java.util.*;

public class 프로그래머스_롤케이크자르기 {
    class Solution {
        public int solution(int[] topping) {
            int answer = 0;
            Set<Integer> firstSet = new HashSet<>();
            Map<Integer, Integer> secondMap = new HashMap<>();

            for(int i = 1; i < topping.length; i++) {
                secondMap.put(topping[i], secondMap.getOrDefault(topping[i], 0) + 1);
            }

            firstSet.add(topping[0]);

            for(int i = 1; i < topping.length; i++) {
                firstSet.add(topping[i]);
                secondMap.put(topping[i], secondMap.get(topping[i]) - 1);

                if(secondMap.get(topping[i]) == 0)
                    secondMap.remove(topping[i]);

                if(firstSet.size() == secondMap.size())
                    answer++;
            }

            return answer;
        }
    }
}

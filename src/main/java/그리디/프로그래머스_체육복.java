package 그리디;

import java.util.*;
import java.util.stream.Collectors;

public class 프로그래머스_체육복 {
    class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = 0;
            Set<Integer> newLost, newReserve, set;

            newLost = Arrays.stream(lost).boxed().collect(Collectors.toSet());
            newReserve = Arrays.stream(reserve).boxed().collect(Collectors.toSet());

            set = new HashSet<>(newReserve);
            set.retainAll(newLost);

            newLost.removeAll(set);
            newReserve.removeAll(set);

            for(int i : newReserve) {
                if(newLost.contains(i - 1))
                    newLost.remove(i - 1);

                else if (newLost.contains(i + 1)) {
                    newLost.remove(i + 1);
                }
            }
            answer = n - newLost.size();

            return answer;
        }
    }
}

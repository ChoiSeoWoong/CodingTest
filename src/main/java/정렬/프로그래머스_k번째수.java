package 정렬;

import java.util.*;

public class 프로그래머스_k번째수 {
    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];

            for(int i = 0; i < commands.length; i++) {
                ArrayList<Integer> arl = new ArrayList<Integer>();
                for(int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                    arl.add(array[j]);
                }
                Collections.sort(arl);
                System.out.println(arl.toString());
                answer[i] = arl.get(commands[i][2] - 1);
            }

            return answer;
        }
    }
}

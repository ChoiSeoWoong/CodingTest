package 구현;

import java.util.*;

public class 프로그래머스_덧칠하기 {
    class Solution {
        public int solution(int n, int m, int[] section) {
            int answer = 0;
            int data = 1;

            for(int s : section) {
                if(data <= s) {
                    answer++;
                    data = s + m;
                }
            }

            return answer;
        }
    }
}

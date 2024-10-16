package 수학;

import java.util.*;

public class 프로그래머스_콜라문제 {
    class Solution {
        public int solution(int a, int b, int n) {
            int answer = 0;

            while(n / a > 0) {
                answer += (n / a) * b;
                n = (n / a) * b + n % a;
            }

            return answer;
        }
    }
}

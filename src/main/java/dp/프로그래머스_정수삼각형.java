package dp;

import java.util.*;

public class 프로그래머스_정수삼각형 {
    class Solution {
        public int solution(int[][] triangle) {
            int answer = 0;

            for(int i = 1; i < triangle.length; i++) {
                for(int j = 0; j < triangle[i].length; j++) {
                    if(j == 0) {
                        triangle[i][j] += triangle[i - 1][j];
                    } else if(i == j) {
                        triangle[i][j] += triangle[i - 1][j - 1];
                    } else {
                        triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
                    }
                }
            }

            int length = triangle[triangle.length - 1].length;
            Arrays.sort(triangle[triangle.length - 1]);

            return triangle[triangle.length - 1][length - 1];
        }
    }
}

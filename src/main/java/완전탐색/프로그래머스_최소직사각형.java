package 완전탐색;

import java.util.*;

public class 프로그래머스_최소직사각형 {
    class Solution {
        public int solution(int[][] sizes) {
            int max = 0;
            int min = 0;

            for(int i = 0; i < sizes.length; i++) {
                int widthMax = Math.max(sizes[i][0], sizes[i][1]);
                int heightMin = Math.min(sizes[i][0], sizes[i][1]);

                max = Math.max(max, widthMax);
                min = Math.max(min, heightMin);
            }

            return max * min;
        }
    }
}

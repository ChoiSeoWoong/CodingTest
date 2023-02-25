package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 백준_일곱난쟁이 {
    static int[] array = new int[7];
    static int[] height = new int[9];
//    static boolean[] visited = new boolean[9];
    public static void dfs(int cnt, int index) {
        if (cnt == 7) {
            int sum = 0;

            for(int i = 0; i < 7; i++) {
                sum += array[i];
            }

            if(sum == 100) {
                for(int i = 0; i < 7; i++) {
                    System.out.println(array[i]);
                }

                System.exit(0);
            }
            return;
        }

        for (int i = index; i < 9; i++) {
            array[cnt] = height[i];
            dfs(cnt + 1, i + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            height[i] = Integer.parseInt(br.readLine());
        }
//        System.out.println(Arrays.toString(height));
        Arrays.sort(height);

        dfs(0, 0);
    }
}

package 조합;

import java.util.*;
import java.io.*;

public class 부녀회장이될테야 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        int[][] dp = new int[15][15];

        for(int i = 0; i < 15; i++) {
            dp[i][1] = 1;
            dp[0][i] = i;
        }

        for(int i = 1; i < 15; i++) {
            for(int j = 2; j < 15; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }

        for(int i = 0; i < k; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            System.out.println(dp[a][b]);
        }
    }
}

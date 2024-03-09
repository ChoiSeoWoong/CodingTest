package dp;

import java.util.*;
import java.io.*;

public class 가장큰정사각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[][] dp = new long[n + 1][m + 1];
        long max = 0;

        for(int i = 0; i < n; i++) {
            String line = br.readLine();

            for(int j = 0; j < m; j++) {
                dp[i][j] = Long.parseLong(String.valueOf(line.charAt(j)));

                if(dp[i][j] == 1 && i > 0 && j > 0) {
                    dp[i][j] = Math.min(dp[i - 1][j - 1],
                            Math.min(dp[i][j - 1], dp[i - 1][j])) + 1;
                }

                if(dp[i][j] > max) {
                    max = dp[i][j];
                }
            }
        }

        System.out.println((int)Math.pow(max, 2));
    }
}

package 조합;

import java.util.*;
import java.io.*;

public class 조약돌꺼내기 {
    static int m, k, t;
    static int[] dp = new int[51];
    static double[] pro = new double[51];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        t = 0;

        for(int i = 0; i < m; i++) {
            dp[i] = Integer.parseInt(st.nextToken());
            t += dp[i];
        }

        k = Integer.parseInt(br.readLine());
        double answer = 0.0;

        for(int i = 0; i < m; i++) {
            if(dp[i] >= k) {
                pro[i] = 1.0;

                for(int j = 0; j < k; j++) {
                    pro[i] *= (double) (dp[i] - j) / (t - j);
                }
            }

            answer += pro[i];
        }

        System.out.println(answer);
    }
}

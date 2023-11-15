package dp;

import java.util.*;
import java.io.*;

public class 구간합구하기4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        int[] sumArr = new int[n + 1];

        st = new StringTokenizer(br.readLine());

        arr[0] = 0;
        sumArr[0] = 0;

        for(int i = 1; i < n + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i < n + 1; i++) {
            sumArr[i] = sumArr[i - 1] + arr[i];
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(sumArr[b] - sumArr[a - 1]);
        }
    }
}

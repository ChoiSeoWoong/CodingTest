package dp;

import java.util.*;
import java.io.*;

public class 나머지합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] arr = new long[n + 1];
        long[] sumArr = new long[n + 1];
        long[] countArr = new long[m];
        long count = 0;
        st = new StringTokenizer(br.readLine());

        for(int i = 1; i < n + 1; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        for(int i = 1; i < n + 1; i++) {
            sumArr[i] = sumArr[i - 1] + arr[i];
            int remainder = (int)(sumArr[i] % m);

            if(remainder == 0) {
                count++;
            }

            countArr[remainder]++;
        }

        for(int i = 0; i < m; i++) {
            if(countArr[i] > 1) {
                count += countArr[i] * (countArr[i] - 1) / 2;
            }
        }

        System.out.println(count);
    }
}

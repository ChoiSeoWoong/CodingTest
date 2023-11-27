package 이분탐색;

import java.util.*;
import java.io.*;

public class k번째수 {
    static int n, k;
    static long result = 0L;

    private static long binarySearch(long start, long end) {
        while(start <= end) {
            long mid = (start + end) / 2;
            long cnt = 0;

            for(int i = 1; i <= n; i++) {
                cnt += Math.min(mid / i, n);
            }

            if(cnt < k) {
                start = mid + 1;
            } else {
                result = mid;
                end = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        long start = 1;
        long end = k;

        System.out.println(binarySearch(start, end));
    }
}

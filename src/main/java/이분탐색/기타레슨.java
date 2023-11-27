package 이분탐색;

import java.util.*;
import java.io.*;

public class 기타레슨 {
    static int n, m;

    private static int binarySearch(int[] arr, int start, int end) {
        while(start <= end) {
            int mid = (start + end) / 2;
            int count = 0;
            int sum = 0;

            for(int i = 0; i < n; i++) {
                if(sum + arr[i] > mid) {
                    count++;
                    sum = 0;
                }

                sum += arr[i];
            }

            if(sum != 0) {
                count++;
            }

            if(count > m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int start = 0;
        int end = 0;
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        System.out.println(binarySearch(arr, start, end));
    }
}

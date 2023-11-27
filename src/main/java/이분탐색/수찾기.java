package 이분탐색;

import java.util.*;
import java.io.*;

public class 수찾기 {
    private static int binarySearch(int[] arr, int start, int end, int find) {
        while(start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] < find) {
                start = mid + 1;
            } else if(arr[mid] > find) {
                end = mid - 1;
            } else {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] resultArr = new int[m];

        for(int i = 0; i < m; i++) {
            int find = Integer.parseInt(st.nextToken());

            resultArr[i] = binarySearch(arr, 0, n - 1, find);
        }

        for(int i = 0; i < m; i++) {
            System.out.println(resultArr[i]);
        }
    }
}

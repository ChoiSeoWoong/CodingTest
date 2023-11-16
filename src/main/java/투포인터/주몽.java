package 투포인터;

import java.util.*;
import java.io.*;

public class 주몽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            if(arr[start] + arr[end] > m) {
                end--;
            } else if(arr[start] + arr[end] < m) {
                start++;
            } else {
                start++;
                end--;
                count++;
            }
        }

        System.out.println(count);
    }
}

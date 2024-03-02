package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연속합2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] leftArr = new int[n];
        leftArr[0] = arr[0];
        int result = leftArr[0];

        for(int i = 1; i < n; i++) {
            leftArr[i] = Math.max(arr[i], leftArr[i - 1] + arr[i]);
            result = Math.max(result, leftArr[i]);
        }

        int[] rightArr = new int[n];
        rightArr[n - 1] = arr[n - 1];

        for(int i = n - 2; i >= 0; i--) {
            rightArr[i] = Math.max(arr[i], rightArr[i + 1] + arr[i]);
        }

        for(int i = 1; i < n - 1; i++) {
            int temp = leftArr[i - 1] + rightArr[i + 1];
            result = Math.max(result, temp);
        }

        System.out.println(result);
    }
}

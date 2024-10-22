package 수학;

import java.util.*;
import java.io.*;

public class 평균구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        double total = 0L;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        for(int i = 0; i < arr.length; i++) {
            double score = (double) arr[i] / max * 100;
            total += score;
        }

        System.out.println(total / n);
    }
}

package 그리디;

import java.util.*;

public class 백준_로프 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] weightArr = new int[n];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            int k = sc.nextInt();
            weightArr[i] = k;
        }

        Arrays.sort(weightArr);

        for(int i = 0; i < n; i++) {
            max = Math.max(max, weightArr[i] * (n - i));
        }

        System.out.println(max);
    }
}

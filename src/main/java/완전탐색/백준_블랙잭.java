package 완전탐색;

import java.util.*;

public class 백준_블랙잭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dataArr = new int[n];
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            int data = sc.nextInt();
            dataArr[i] = data;
        }

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    sum = dataArr[i] + dataArr[j] + dataArr[k];

                    if(sum <= m && sum > max)
                        max = sum;
                }
            }
        }

        System.out.println(max);
    }
}

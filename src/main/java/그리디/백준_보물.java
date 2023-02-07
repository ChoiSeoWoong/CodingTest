package 그리디;

import java.util.*;

public class 백준_보물 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];
        int result = 0;

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b, Comparator.reverseOrder());

        for(int i = 0; i < n; i++) {
            result += a[i] * b[i];
        }

        System.out.println(result);
    }
}

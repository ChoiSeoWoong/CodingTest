package 기타;

import java.util.*;

public class ComparatorTest {
    public static void main(String[] args) {
        int[][] array = {
                {3, 4},
                {2, 3},
                {3, 2},
                {1, 5},
                {2, 2}
        };

//        // x, y 기준으로 정렬 (x를 기준으로 정렬, x가 같으면 y를 기준으로 정렬)
//        Arrays.sort(array, Comparator.comparingInt((int[] a) -> a[0]).thenComparingInt(a -> a[1]));
//
//        // 정렬된 결과 출력
//        for (int[] arr : array) {
//            System.out.println(Arrays.toString(arr));
//        }

        // x, y 기준으로 정렬 (y를 기준으로 정렬, y가 같으면 x를 기준으로 정렬)
        Arrays.sort(array, Comparator.comparingInt((int[] a) -> a[1]).thenComparingInt(a -> a[0]));

        // 정렬된 결과 출력
        for (int[] arr : array) {
            System.out.println(Arrays.toString(arr));
        }
    }
}

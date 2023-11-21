package 정렬;

import java.util.*;
import java.io.*;

public class 버블소트 {
    static class newArr implements Comparable<newArr> {
        int value;
        int index;

        public newArr(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(newArr o) {
            return this.value - o.value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        newArr[] arr = new newArr[n];

        for(int i = 0; i < n; i++) {
            arr[i] = new newArr(Integer.parseInt(br.readLine()), i);
        }

        Arrays.sort(arr);
        int max = 0;

        for(int i = 0; i < n; i++) {
            max = Math.max(max, arr[i].index - i);
        }

        System.out.println(max + 1);
    }
}

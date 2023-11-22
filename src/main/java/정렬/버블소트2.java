package 정렬;

import java.util.*;
import java.io.*;

public class 버블소트2 {
    static int[] arr, tmp;
    static long count;

    private static void mergeSort(int start, int end) {
        if(end - start < 1)
            return;

        int mid = start + (end - start) / 2;
        mergeSort(start, mid);
        mergeSort(mid + 1, end);

        for(int i = start; i <= end; i++) {
            tmp[i] = arr[i];
        }

        int k = start;
        int idx1 = start;
        int idx2 = mid + 1;

        while(idx1 <= mid && idx2 <= end) {
            if(tmp[idx1] > tmp[idx2]) {
                arr[k] = tmp[idx2];
                count += idx2 - k;
                k++;
                idx2++;
            } else {
                arr[k] = tmp[idx1];
                k++;
                idx1++;
            }
        }

        while(idx1 <= mid) {
            arr[k] = tmp[idx1];
            k++;
            idx1++;
        }

        while(idx2 <= end) {
            arr[k] = tmp[idx2];
            k++;
            idx2++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n + 1];
        tmp = new int[n + 1];
        count = 0L;

        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(1, n);

        System.out.println(count);
    }
}

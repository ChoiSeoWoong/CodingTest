package 정렬;

import java.util.*;
import java.io.*;

//병합 정렬

public class 수정렬하기2 {
    static int[] arr, tmp;

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
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        tmp = new int[n + 1];

        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(1, n);

        for(int i = 1; i <= n; i++) {
            bw.write(arr[i] + "\n");
        }

        bw.flush();
        br.close();
    }
}

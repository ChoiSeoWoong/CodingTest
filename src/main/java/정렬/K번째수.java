package 정렬;

import java.util.*;
import java.io.*;

public class K번째수 {
    private static void quickSort(int[] arr, int start, int end, int find) {
        if(start < end) {
            int pivot = partition(arr, start, end);

            if(pivot == find) {
                return;
            } else if(pivot > find) {
                quickSort(arr, start, pivot - 1, find);
            } else {
                quickSort(arr, pivot + 1, end, find);
            }
        }
    }

    private static int partition(int[] arr, int start, int end) {
        if(start + 1 == end) {
            if(arr[start] > arr[end]) {
                swap(arr, start, end);
            }
        }

        int mid = (start + end) / 2;
        swap(arr, start, mid);
        int pivot = arr[start];
        int i = start + 1;
        int j = end;

        while(i <= j) {
            while (j >= start + 1 && pivot < arr[j]) {
                j--;
            }

            while(i <= end && pivot > arr[i]) {
                i++;
            }

            if(i <= j) {
                swap(arr, i++, j--);
            }
        }

        arr[start] = arr[j];
        arr[j] = pivot;

        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(arr, 0, n - 1, k - 1);
        System.out.println(arr[k - 1]);
    }
}

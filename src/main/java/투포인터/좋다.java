package 투포인터;

import java.util.*;
import java.io.*;

public class 좋다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);
        int count = 0;

        for(int i = 0; i < n; i++) {
            int start = 0;
            int end = arr.length - 1;

            while(start < end) {
                if(arr[start] + arr[end] > arr[i]) {
                    end--;
                } else if(arr[start] + arr[end] < arr[i]) {
                    start++;
                } else {
                    if(start != i && end != i) {
                        count++;
                        break;
                    } else if(start == i) {
                        start++;
                    } else if(end == i) {
                        end--;
                    }
                }
            }
        }

        System.out.println(count);
    }
}

package 그리디;

import java.util.*;
import java.io.*;

public class 수묶기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int one = 0;
        int zero = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        PriorityQueue<Integer> plusPq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusPq = new PriorityQueue<>();
        int pResult = 0;
        int mResult = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] < 0) {
                minusPq.add(arr[i]);
            } else if(arr[i] > 1) {
                plusPq.add(arr[i]);
            } else if(arr[i] == 0) {
                zero++;
            } else {
                one++;
            }
        }

        while(plusPq.size() != 1 && !plusPq.isEmpty()) {
            int a = plusPq.poll();
            int b = plusPq.poll();
            pResult += (a * b);
        }

        if(!plusPq.isEmpty()) {
            pResult += plusPq.poll();
        }

        while(minusPq.size() != 1 && !minusPq.isEmpty()) {
            int a = minusPq.poll();
            int b = minusPq.poll();
            mResult += (a * b);
        }

        if(!minusPq.isEmpty()) {
            if(zero == 0) {
                mResult += minusPq.poll();
            }
        }

        pResult += one;

        System.out.println(pResult + mResult);
    }
}

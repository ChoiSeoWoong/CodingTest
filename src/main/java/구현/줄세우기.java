package 구현;

import java.util.*;
import java.io.*;

public class 줄세우기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(br.readLine());

        for(int i = 0; i < p; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer.parseInt(st.nextToken());
            int cnt = 0;
            int[] arr = new int[20];

            for(int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for(int j = 0; j < arr.length; j++) {
                for(int k = 0; k < j; k++) {
                    if(arr[j] < arr[k]) {
                        cnt++;
                    }
                }
            }

            System.out.println(i + 1 + " " + cnt);
        }
    }
}

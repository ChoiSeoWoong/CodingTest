package 수학;

import java.io.*;
import java.util.*;

public class 거의소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long[] arr = new long[10000001];
        int count = 0;

        for(int i = 2; i < 10000001; i++) {
            arr[i] = i;
        }

        for(int i = 2; i <= Math.sqrt(10000001); i++) {
            if(arr[i] == 0) {
                continue;
            }

            for(int j = i + i; j < arr.length; j += i) {
                arr[j] = 0;
            }
        }

        for(int i = 2; i < 10000001; i++) {
            if(arr[i] != 0) {
                long tmp = arr[i];

                while((double)arr[i] <= (double)b / tmp) {
                    if((double)arr[i] >= (double)a / tmp) {
                        count++;
                    }

                    tmp *= arr[i];
                }
            }
        }

        System.out.println(count);
    }
}

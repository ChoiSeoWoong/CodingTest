package 구현;

import java.util.*;
import java.io.*;

public class 제곱ㄴㄴ수 {
    static long min, max;

    private static boolean isSquareNumber(boolean[] check, long n) {
        for(long i = 2; i <= Math.sqrt(n); i++) {
            long pow = i * i;
            long start = min / pow;

            if(min % pow != 0) {
                start++;
            }

            for(long j = start; pow * j <= max; j++) {
                check[(int)((pow * j) - min)] = true;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        min = Long.parseLong(st.nextToken());
        max = Long.parseLong(st.nextToken());
        boolean[] check = new boolean[(int)(max - min + 1)];
        int count = 0;

        for(long i = 2; i <= Math.sqrt(max); i++) {
            long pow = i * i;
            long start = min / pow;

            if(min % pow != 0) {
                start++;
            }

            for(long j = start; pow * j <= max; j++) {
                check[(int)((pow * j) - min)] = true;
            }
        }

        for(int i = 0; i <= max - min; i++) {
            if(!check[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}

package 구현;

import java.util.*;
import java.io.*;

public class 소수구하기 {
    private static boolean isPrimeNumber(int n) {
        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for(int i = m; i <= n; i++) {
            if(isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }
}

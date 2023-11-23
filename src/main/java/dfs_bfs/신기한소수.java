package dfs_bfs;

import java.util.*;
import java.io.*;

public class 신기한소수 {
    static int n;

    private static void dfs(int num, int cipher) {
        if(cipher == n) {
            if(isPrimeNumber(num)) {
                System.out.println(num);
            }

            return;
        }

        for(int i = 1; i < 10; i++) {
            if(i % 2 == 0) {
                continue;
            }

            if(isPrimeNumber(num * 10 + i)) {
                dfs(num * 10 + i, cipher + 1);
            }
        }
    }

    private static boolean isPrimeNumber(int num) {
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        dfs(2, 1);
        dfs(3, 1);
        dfs(5, 1);
        dfs(7, 1);
    }
}

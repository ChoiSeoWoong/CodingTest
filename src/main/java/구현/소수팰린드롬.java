package 구현;

import java.util.*;
import java.io.*;

public class 소수팰린드롬 {
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

    private static boolean isPalindrome(int n) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        sb.append(String.valueOf(n));
        sb2.append(String.valueOf(n));

        if(sb.toString().equals(sb2.reverse().toString())) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = n; i <= 10000000; i++) {
            if(isPrimeNumber(i) && isPalindrome(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}

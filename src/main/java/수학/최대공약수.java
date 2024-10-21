package 수학;

import java.util.*;
import java.io.*;

public class 최대공약수 {
    private static long getGCD(long num1, long num2) {
        if(num1 % num2 == 0) {
            return num2;
        }

        return getGCD(num2, num1 % num2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long gcd = getGCD(a, b);
        String one = "1";

        while(gcd > 0) {
            bw.write(one);
            gcd--;
        }

        bw.flush();
        br.close();
    }
}

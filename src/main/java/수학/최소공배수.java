package 수학;

import java.util.*;
import java.io.*;

public class 최소공배수 {
    private static int getGCD(int num1, int num2) {
        if(num1 % num2 == 0) {
            return num2;
        }

        return getGCD(num2, num1 % num2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a * b / getGCD(a, b));
        }
    }
}

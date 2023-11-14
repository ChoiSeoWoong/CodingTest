package 구현;

import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class 큰수의최대공약수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();

            if(a.equals(b)) {
                System.out.println("#" + test_case + " " + a);
            } else {
                System.out.println("#" + test_case + " " + 1);
            }
            /////////////////////////////////////////////////////////////////////////////////////////////
			/*
				 이 부분에 여러분의 알고리즘 구현이 들어갑니다.
			 */
            /////////////////////////////////////////////////////////////////////////////////////////////

        }
    }
}

package 구현;

import java.util.*;
import java.io.*;

public class 등차수열만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            double result = 0;

            if((b - a) == (c - b)) {
                System.out.println("#" + test_case + " " + 0.0);
            } else {
                if((b - a) > (c - b)) {
                    result = (double)((b - a) - (c - b)) / 2;
                } else {
                    result = (double)((c - b) - (b - a)) / 2;
                }

                System.out.printf("#" + test_case + " " + "%.1f", result);
            }
            /////////////////////////////////////////////////////////////////////////////////////////////
			/*
				 이 부분에 여러분의 알고리즘 구현이 들어갑니다.
			 */
            /////////////////////////////////////////////////////////////////////////////////////////////


        }
    }
}

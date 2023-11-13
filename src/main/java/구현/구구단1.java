package 구현;

import java.util.*;
import java.io.*;

public class 구구단1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt();
            boolean flag = false;

            for(int i = 1; i <= 9; i++) {
                for(int j = 1; j <= 9; j++) {
                    int mul = i * j;

                    if(n == mul) {
                        flag = true;
                    }
                }
            }

            if(flag) {
                System.out.println("#" + test_case + " " + "Yes");
                flag = false;
            } else {
                System.out.println("#" + test_case + " " + "No");
            }
            /////////////////////////////////////////////////////////////////////////////////////////////
			/*
				 이 부분에 여러분의 알고리즘 구현이 들어갑니다.
			 */
            /////////////////////////////////////////////////////////////////////////////////////////////

        }
    }
}

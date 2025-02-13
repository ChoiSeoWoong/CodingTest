package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 홀수만더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int result = 0;

            for(int j = 0; j < 10; j++) {
                int n = Integer.parseInt(st.nextToken());

                if(n % 2 == 1) {
                    result += n;
                }
            }

            System.out.println("#" + (i + 1) + " " + result);
        }
    }
}

package 투포인터;

import java.util.*;
import java.io.*;

public class 수들의합5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int sum = 1;
        int start = 1;
        int end = 1;

        while(end != n) {
            if(sum > n) {
                sum -= start;
                start++;
            } else if(sum < n) {
                end++;
                sum += end;
            } else {
                end++;
                sum += end;
                count++;
            }
        }

        System.out.println(count);
    }
}

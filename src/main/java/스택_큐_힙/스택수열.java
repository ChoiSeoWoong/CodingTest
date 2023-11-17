package 스택_큐_힙;

import java.util.*;
import java.io.*;

public class 스택수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int num = 1;
        boolean flag = true;

        for(int i = 0; i < n; i++) {
            int val1 = arr[i];

            if(val1 >= num) {
                while(val1 >= num) {
                    stack.add(num++);
                    sb.append("+\n");
                }

                stack.pop();
                sb.append("-\n");
            } else {
                int val2 = stack.pop();

                if(val2 > val1) {
                    System.out.println("NO");
                    flag = false;
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }

        if(flag) {
            System.out.println(sb.toString());
        }
    }
}

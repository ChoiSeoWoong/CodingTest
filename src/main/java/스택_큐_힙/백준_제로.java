package 스택_큐_힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 백준_제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for(int i = 0; i < k; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num != 0)
                stack.add(num);

            else
                stack.pop();
        }

        if(!stack.isEmpty()) {
            for (Integer n : stack) {
                sum += n;
            }

            System.out.println(sum);
        }

        else
            System.out.println(0);
    }
}

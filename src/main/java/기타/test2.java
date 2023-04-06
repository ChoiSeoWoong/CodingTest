package 기타;

import java.io.*;
import java.util.*;

public class test2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();

        System.out.println(solution(input, stack));
    }

    private static String solution(String input, Stack<Character> stack) {
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[')
                stack.add(input.charAt(i));

            else {
                if(stack.isEmpty()) {
                    return "False";
                }

                else {
                    stack.pop();
                }
            }
        }

        if(stack.isEmpty()) {
            return "True";
        }

        else {
            return "False";
        }
    }
}

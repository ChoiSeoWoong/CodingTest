package 스택_큐_힙;

import java.util.*;
import java.io.*;

public class 오큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[n];
        int[] answer = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        stack.add(0);

        for(int i = 1; i < n; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                answer[stack.pop()] = arr[i];
            }

            stack.add(i);
        }

        while(!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        for(int i = 0; i < n; i++) {
            bw.write(answer[i] + " ");
        }

        bw.flush();
        br.close();
    }
}

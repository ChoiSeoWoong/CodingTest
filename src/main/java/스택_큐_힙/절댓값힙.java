package 스택_큐_힙;

import java.util.*;
import java.io.*;

public class 절댓값힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);

            if(absA == absB) {
                return a > b ? 1 : -1;
            } else {
                return absA - absB;
            }
        });

        for(int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if(x != 0) {
                pq.add(x);
            } else {
                if(pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    int val = pq.poll();
                    System.out.println(val);
                }
            }
        }
    }
}

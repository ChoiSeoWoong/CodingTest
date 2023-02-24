package 스택_큐_힙;

import java.util.*;

public class 백준_카드2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while(queue.size() != 1) {
            queue.poll();

            int pollData = queue.poll();
            queue.add(pollData);
        }

        System.out.println(queue.poll());
    }
}

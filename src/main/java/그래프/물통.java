package 그래프;

import java.util.*;
import java.io.*;

public class 물통 {
    static int[] send = {0, 0, 1, 1, 2, 2};
    static int[] receive = {1, 2, 0, 2, 0, 1};
    static boolean[][] visited;
    static boolean[] answer;
    static int[] now;

    static class Node {
        int a, b;

        Node(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    private static void bfs() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0));
        visited[0][0] = true;
        answer[now[2]] = true;

        while(!queue.isEmpty()) {
            Node node = queue.poll();
            int a = node.a;
            int b = node.b;
            int c = now[2] - a - b;

            for(int i = 0; i < 6; i++) {
                int[] next = {a, b, c};
                next[receive[i]] += next[send[i]];
                next[send[i]] = 0;

                if(next[receive[i]] > now[receive[i]]) {
                    next[send[i]] = next[receive[i]] - now[receive[i]];
                    next[receive[i]] = now[receive[i]];
                }

                if(!visited[next[0]][next[1]]) {
                    visited[next[0]][next[1]] = true;
                    queue.add(new Node(next[0], next[1]));

                    if(next[0] == 0) {
                        answer[next[2]] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        now = new int[3];
        now[0] = Integer.parseInt(st.nextToken());
        now[1] = Integer.parseInt(st.nextToken());
        now[2] = Integer.parseInt(st.nextToken());
        visited = new boolean[201][201];
        answer = new boolean[201];

        bfs();

        for(int i = 0; i < answer.length; i++) {
            if(answer[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

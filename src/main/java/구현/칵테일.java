package 구현;

import java.util.*;
import java.io.*;

public class 칵테일 {
    static List<List<Node>> graph = new ArrayList<>();
    static long lcm;
    static boolean[] visited;
    static long[] arr;

    static class Node {
        int b, p, q;

        Node(int b, int p, int q) {
            this.b = b;
            this.p = p;
            this.q = q;
        }
    }

    private static void dfs(int n) {
        visited[n] = true;

        for(Node node : graph.get(n)) {
            int next = node.b;

            if(!visited[next]) {
                arr[next] = arr[n] * node.q / node.p;
                dfs(next);
            }
        }
    }

    private static long getGCD(long num1, long num2) {
        if(num2 == 0) {
            return num1;
        } else {
            return getGCD(num2, num1 % num2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        visited = new boolean[n];
        arr = new long[n];
        lcm = 1;

        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Node(b, p, q));
            graph.get(b).add(new Node(a, q, p));
            lcm *= (p * q / getGCD(p, q));
        }

        arr[0] = lcm;
        dfs(0);
        long gcd = arr[0];

        for(int i = 1; i < n; i++) {
            gcd = getGCD(gcd, arr[i]);
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] / gcd + " ");
        }
    }
}

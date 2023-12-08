package 그래프;

import java.util.*;
import java.io.*;

public class 집합의표현 {
    static class Node {
        int oper, a, b;

        Node(int oper, int a, int b) {
            this.oper = oper;
            this.a = a;
            this.b = b;
        }
    }

    private static int findParent(int[] parent, int x) {
        if(parent[x] != x) {
            parent[x] = findParent(parent, parent[x]);
        }

        return parent[x];
    }

    private static void unionParent(int[] parent, int a, int b) {
        int x = findParent(parent, a);
        int y = findParent(parent, b);

        if(x < y) {
            parent[y] = x;
        } else {
            parent[x] = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] parent = new int[n + 1];
        List<Node> graph = new ArrayList<>();

        for(int i = 0; i < n + 1; i++) {
            parent[i] = i;
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            graph.add(new Node(x, y, z));
        }

        for(Node node : graph) {
            int oper = node.oper;
            int a = node.a;
            int b = node.b;

            if(oper == 0) {
                unionParent(parent, a, b);
            } else if(oper == 1){
                if(findParent(parent, a) == findParent(parent, b)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}

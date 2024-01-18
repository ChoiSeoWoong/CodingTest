package 트리;

import java.util.*;
import java.io.*;

public class LCA {
    static List<List<Integer>> tree = new ArrayList<>();
    static int[] depth;
    static int[] parent;
    static boolean[] visited;

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        int level = 1;
        int size = 1;
        int count = 0;

        while (!queue.isEmpty()) {
            int curNode = queue.poll();

            for(int node : tree.get(curNode)) {
                if(!visited[node]) {
                    visited[node] = true;
                    queue.add(node);
                    parent[node] = curNode;
                    depth[node] = level;
                }
            }

            count++;

            if(count == size) {
                count = 0;
                size = queue.size();
                level++;
            }
        }
    }

    private static int getLCA(int a, int b) {
        if(depth[a] < depth[b]) {
            int temp = a;
            a = b;
            b = temp;
        }

        while(depth[a] != depth[b]) {
            a = parent[a];
        }

        while(a != b) {
            a = parent[a];
            b = parent[b];
        }

        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n + 1; i++) {
            tree.add(new ArrayList<>());
        }

        for(int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            tree.get(a).add(b);
            tree.get(b).add(a);
        }

        depth = new int[n + 1];
        parent = new int[n + 1];
        visited = new boolean[n + 1];

        bfs(1);

        int m = Integer.parseInt(br.readLine());

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(getLCA(a, b));
        }
    }
}

package dfs_bfs;

import java.util.*;
import java.io.*;

public class dfs와bfs {
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    private static void dfs(int start) {
        visited[start] = true;

        System.out.print(start + " ");

        for(int v : graph.get(start)) {
            if(!visited[v]) {
                dfs(v);
            }
        }
    }

    private static void bfs(int start) {
        visited[start] = true;
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);

        while(!queue.isEmpty()) {
            int data = queue.poll();
            System.out.print(data + " ");

            for(int v : graph.get(data)) {
                if(!visited[v]) {
                    queue.add(v);
                    visited[v] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1];

        for(int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i = 1; i < n + 1; i++) {
            Collections.sort(graph.get(i));
        }

        dfs(v);
        System.out.println();
        visited = new boolean[n + 1];
        bfs(v);
    }
}

package dfs_bfs;

import java.util.*;

public class 백준_바이러스 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int cnt = 0;

    public static void dfs(int start) {
        visited[start] = true;

        for(int i : graph.get(start)) {
            if(!visited[i]) {
                dfs(i);
                cnt++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int u = sc.nextInt();
        visited = new boolean[v + 1];

        for(int i = 0; i < v + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < u; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

//        System.out.println(graph.toString());
        dfs(1);
        System.out.println(cnt);
    }
}

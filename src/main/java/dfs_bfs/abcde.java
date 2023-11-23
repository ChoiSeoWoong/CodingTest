package dfs_bfs;

import java.util.*;
import java.io.*;

public class abcde {
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static boolean flag = false;

    private static void dfs(int start, int depth) {
        if(depth == 5) {
            flag = true;

            return;
        }

        visited[start] = true;

        for(int v : graph.get(start)) {
            if(!visited[v]) {
                dfs(v, depth + 1);
            }
        }

        visited[start] = false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visited = new boolean[n];

        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i = 0; i < n; i++) {
            dfs(i, 1);

            if(flag) {
                break;
            }
        }

        if(flag) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

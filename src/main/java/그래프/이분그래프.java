package 그래프;

import java.util.*;
import java.io.*;

public class 이분그래프 {
    static List<List<Integer>> graph;
    static int[] check;
    static boolean[] visited;
    static boolean flag;

    private static void dfs(int start) {
        visited[start] = true;

        for(int node : graph.get(start)) {
            if(!visited[node]) {
                check[node] = (check[start] + 1) % 2;
                dfs(node);
            } else if(check[node] == check[start]) {
                flag = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        for(int i = 0; i < k; i++) {
            String[] s = br.readLine().split(" ");
            int v = Integer.parseInt(s[0]);
            int e = Integer.parseInt(s[1]);

            visited = new boolean[v + 1];
            check = new int[v + 1];
            flag = true;
            graph = new ArrayList<>();

            for(int j = 0; j < v + 1; j++) {
                graph.add(new ArrayList<>());
            }

            for(int j = 0; j < e; j++) {
                s = br.readLine().split(" ");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);

                graph.get(a).add(b);
                graph.get(b).add(a);
            }

            for(int j = 1; j < v + 1; j++) {
                if(flag) {
                    dfs(j);
                } else {
                    break;
                }
            }

            if(flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

package 트리;

import java.util.*;
import java.io.*;

public class 트리의부모찾기 {
    static List<List<Integer>> tree = new ArrayList<>();
    static boolean[] visited;
    static int[] answer;

    private static void dfs(int start) {
        visited[start] = true;

        for(int node : tree.get(start)) {
            if(!visited[node]) {
                answer[node] = start;
                dfs(node);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        visited = new boolean[n + 1];
        answer = new int[n + 1];

        for(int i = 0; i < n + 1; i++) {
            tree.add(new ArrayList<>());
        }

        for(int i = 1; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            tree.get(a).add(b);
            tree.get(b).add(a);
        }

        dfs(1);

        for(int i = 2; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}

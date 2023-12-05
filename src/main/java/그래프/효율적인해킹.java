package 그래프;

import java.util.*;
import java.io.*;

public class 효율적인해킹 {
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int[] answer;
    static int count = 0;

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()) {
            int node = queue.poll();

            for(int v : graph.get(node)) {
                if(!visited[v]) {
                    visited[v] = true;
                    count++;
                    queue.add(v);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        answer = new int[n + 1];

        for(int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(b).add(a);
        }

        int max = -1;

        for(int i = 1; i <= n; i++) {
            visited = new boolean[n + 1];
            count = 0;
            bfs(i);
            answer[i] = count;
            max = Math.max(max, count);
        }

        for(int i = 1; i <= n; i++) {
            if(answer[i] == max) {
                sb.append(i + " ");
            }
        }

        System.out.println(sb);
    }
}

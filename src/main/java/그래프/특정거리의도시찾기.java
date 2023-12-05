package 그래프;

import java.util.*;
import java.io.*;

public class 특정거리의도시찾기 {
    static List<List<Integer>> graph = new ArrayList<>();
    static int[] distance;

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        distance[start]++;

        while(!queue.isEmpty()) {
            int node = queue.poll();

            for(int v : graph.get(node)) {
                if(distance[v] == -1) {
                    distance[v] = distance[node] + 1;
                    queue.add(v);
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        List<Integer> answer = new ArrayList<>();
        distance = new int[n + 1];

        for(int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
        }

        for(int i = 0; i < n + 1; i++) {
            distance[i] = -1;
        }

        bfs(x);

        for(int i = 0; i < distance.length; i++) {
            if(distance[i] == k) {
                answer.add(i);
            }
        }

        if(answer.isEmpty()) {
            System.out.println(-1);
        } else {
            Collections.sort(answer);

            for(int num : answer) {
                System.out.println(num);
            }
        }
    }
}

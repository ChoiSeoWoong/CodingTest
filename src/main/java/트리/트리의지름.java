package 트리;

import java.util.*;
import java.io.*;

public class 트리의지름 {
    static List<List<Node>> graph = new ArrayList<>();
    static int[] distance;
    static boolean[] visited;

    static class Node {
        int v, dist;

        Node(int v, int dist) {
            this.v = v;
            this.dist = dist;
        }
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()) {
            int num = queue.poll();

            for(Node node : graph.get(num)) {
                int v = node.v;
                int dist = node.dist;

                if(!visited[v]) {
                    queue.add(v);
                    visited[v] = true;
                    distance[v] = distance[num] + dist;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        distance = new int[n + 1];
        visited = new boolean[n + 1];

        for(int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            while(true) {
                int v = Integer.parseInt(st.nextToken());

                if(v == -1) {
                    break;
                }

                int dist = Integer.parseInt(st.nextToken());
                graph.get(num).add(new Node(v, dist));
            }
        }

        bfs(1);
        int max = 1;

        for(int i = 2; i < n + 1; i++) {
            if(distance[max] < distance[i]) {
                max = i;
            }
        }

        distance = new int[n + 1];
        visited = new boolean[n + 1];
        bfs(max);

        Arrays.sort(distance);
        System.out.println(distance[n]);
    }
}

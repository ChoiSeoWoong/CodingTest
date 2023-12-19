package 그래프;

import java.util.*;
import java.io.*;

public class k번째최단경로찾기 {
    static int n, m, k;
    static int[][] graph = new int[1001][1001];
    static int INF = Integer.MAX_VALUE;
    static Queue<Integer>[] distance;

    static class Node {
        int node, dist;

        Node(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }
    }

    private static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) ->
                Integer.compare(a.dist, b.dist));

        pq.add(new Node(start, 0));
        distance[start].add(0);

        while(!pq.isEmpty()) {
            Node data = pq.poll();
            int now = data.node;
            int dist = data.dist;

            if(distance[now].peek() < dist) {
                continue;
            }

            for(int i = 1; i < n + 1; i++) {
                int cost = dist + graph[now][i];

                if(graph[now][i] != 0) {
                    if(distance[i].size() < k) {
                        distance[i].add(cost);
                        pq.add(new Node(i, cost));
                    } else if(cost < distance[i].peek()) {
                        distance[i].poll();
                        distance[i].add(cost);
                        pq.add(new Node(i, cost));
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        distance = new PriorityQueue[n + 1];

        Comparator<Integer> cp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        for(int i = 0; i < n + 1; i++) {
            distance[i] = new PriorityQueue<>(k, cp);
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph[a][b] = c;
        }

        dijkstra(1);

        for(int i = 1; i < n + 1; i++) {
            if(distance[i].size() == k) {
                System.out.println(distance[i].peek());
            } else {
                System.out.println(-1);
            }
        }
    }
}

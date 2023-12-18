package 그래프;

import java.util.*;
import java.io.*;

public class 최단경로 {
    static List<List<Node>> graph = new ArrayList<>();
    static int[] distance;
    static int v, e, k;
    static int INF = Integer.MAX_VALUE;

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
        distance[start] = 0;

        while(!pq.isEmpty()) {
            Node data = pq.poll();
            int now = data.node;
            int dist = data.dist;

            if(distance[now] < dist) {
                continue;
            }

            for(Node n: graph.get(now)) {
                int node = n.node;
                int weight = n.dist;
                int cost = dist + weight;

                if(cost < distance[node]) {
                    distance[node] = cost;
                    pq.add(new Node(node, cost));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(br.readLine());
        distance = new int[v + 1];

        for(int i = 0; i < v + 1; i++) {
            graph.add(new ArrayList<>());
            distance[i] = INF;
        }

        for(int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Node(b, c));
        }

        dijkstra(k);

        for(int i = 1; i < v + 1; i++) {
            if(distance[i] == INF) {
                System.out.println("INF");
            } else {
                System.out.println(distance[i]);
            }
        }
    }
}

package 그래프;

import java.util.*;
import java.io.*;

public class 타임머신 {
    static List<List<Node>> graph = new ArrayList<>();
    static long[] distance;
    static Node[] nodes;

    static class Node {
        int start, end, time;

        Node(int start, int end, int time) {
            this.start = start;
            this.end = end;
            this.time = time;
        }
    }

    private static void bellmanFord(int n, int m) {
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < m; j++) {
                Node node = nodes[j];

                if(distance[node.start] != Integer.MAX_VALUE
                && distance[node.end] > distance[node.start] + node.time) {
                    distance[node.end] = distance[node.start] + node.time;
                }
            }
        }

        boolean cycle = false;

        for(int i = 0; i < m; i++) {
            Node node = nodes[i];

            if(distance[node.start] != Integer.MAX_VALUE
                    && distance[node.end] > distance[node.start] + node.time) {
                cycle = true;
            }
        }

        if(!cycle) {
            for(int i = 2; i < n + 1; i++) {
                if(distance[i] == Integer.MAX_VALUE) {
                    System.out.println(-1);
                } else {
                    System.out.println(distance[i]);
                }
            }
        } else {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        nodes = new Node[m + 1];
        distance = new long[n + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());

            nodes[i] = new Node(start, end, time);
        }

        distance[1] = 0;
        bellmanFord(n, m);
    }
}

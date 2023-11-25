package dfs_bfs;

import java.util.*;
import java.io.*;

public class 미로탐색 {
    static int[][] graph;
    static int n, m;
    static boolean[][] visited;

    static class Node {
        int x, y, cnt;

        Node(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }

    private static int bfs(int a, int b) {
        Queue<Node> queue = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        queue.add(new Node(a, b, 0));
        visited[a][b] = true;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int x = node.x;
            int y = node.y;
            int cnt = node.cnt;

            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }

                if(graph[nx][ny] == 0) {
                    continue;
                }

                if(graph[nx][ny] == 1 && !visited[nx][ny]){
                    queue.add(new Node(nx, ny, cnt + 1));
                    graph[nx][ny] = graph[x][y] + 1;
                    visited[nx][ny] = true;
                }
            }
        }

        return graph[n - 1][m - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i < n; i++) {
            String[] arr = br.readLine().split("");

            for(int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(arr[j]);
            }
        }

        System.out.println(bfs(0, 0));
    }
}

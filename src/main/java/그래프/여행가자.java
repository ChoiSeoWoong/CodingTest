package 그래프;

import java.util.*;
import java.io.*;

public class 여행가자 {
    static int[] parent;

    private static int findParent(int x) {
        if(parent[x] != x) {
            parent[x] = findParent(parent[x]);
        }

        return parent[x];
    }

    private static void unionParent(int a, int b) {
        int x = findParent(a);
        int y = findParent(b);

        if(x < y) {
            parent[y] = x;
        } else {
            parent[x] = y;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] graph = new int[n + 1][n + 1];

        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        int[] route = new int[m + 1];

        for (int i = 1; i < m + 1; i++) {
            route[i] = sc.nextInt();
        }

        parent = new int[n + 1];

        for(int i = 1; i < n + 1; i++) {
            parent[i] = i;
        }

        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                if(graph[i][j] == 1) {
                    unionParent(i, j);
                }
            }
        }

        int index = findParent(route[1]);

        for(int i = 2; i < route.length; i++) {
            if(index != findParent(route[i])) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}

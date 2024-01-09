package 그래프;

import java.util.*;
import java.io.*;

public class 플로이드 {
    static int n, m;
    static int[][] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        distance = new int[n + 1][n + 1];

        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                if(i == j) {
                    distance[i][j] = 0;
                } else {
                    distance[i][j] = 10000001;
                }
            }
        }

        for(int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(distance[a][b] > c) {
                distance[a][b] = c;
            }
        }

        for(int k = 1; k < n + 1; k++) {
            for(int i = 1; i < n + 1; i++) {
                for(int j = 1; j < n + 1; j++) {
                    if(distance[i][j] > distance[i][k] + distance[k][j]) {
                        distance[i][j] = distance[i][k] + distance[k][j];
                    }
                }
            }
        }

        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                if(distance[i][j] == 10000001) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(distance[i][j] + " ");
                }
            }

            System.out.println();
        }
    }
}

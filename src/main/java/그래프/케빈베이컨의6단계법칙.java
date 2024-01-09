package 그래프;

import java.io.*;
import java.util.*;

public class 케빈베이컨의6단계법칙 {
    static int n, m;
    static int[][] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
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
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            distance[a][b] = 1;
            distance[b][a] = 1;
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

        int min = Integer.MAX_VALUE;
        int answer = -1;

        for(int i = 1; i < n + 1; i++) {
            int temp = 0;

            for(int j = 1; j < n + 1; j++) {
                temp += distance[i][j];
            }

            if(min > temp) {
                min = temp;
                answer = i;
            }
        }

        System.out.println(answer);
    }
}

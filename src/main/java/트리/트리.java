package 트리;

import java.util.*;
import java.io.*;

public class 트리 {
    static List<List<Integer>> tree = new ArrayList<>();
    static boolean[] visited;
    static int removeNode;
    static int answer = 0;

    private static void dfs(int start) {
        visited[start] = true;
        int currentNode = 0;

        for(int node : tree.get(start)) {
            if(!visited[node] && node != removeNode) {
                currentNode++;
                dfs(node);
            }
        }

        if (currentNode == 0) {
            answer++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int root = 0;
        visited = new boolean[n];

        for(int i = 0; i < n; i++) {
            tree.add(new ArrayList<>());
        }

        for(int i = 0; i < n; i++) {
            int data = Integer.parseInt(st.nextToken());

            if(data != -1) {
                tree.get(i).add(data);
                tree.get(data).add(i);
            } else {
                root = i;
            }
        }

        removeNode = Integer.parseInt(br.readLine());

        if(removeNode == root) {
            System.out.println(0);
        } else {
            dfs(root);
            System.out.println(answer);
        }
    }
}

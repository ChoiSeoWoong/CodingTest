package 트리;

import java.util.*;
import java.io.*;

public class 트리순회 {
    static int[][] arr;
    private static void preOrder(int node) {
        if(node == -1) {
            return;
        }

        System.out.print((char)(node + 'A'));
        preOrder(arr[node][0]);
        preOrder(arr[node][1]);
    }

    private static void inOrder(int node) {
        if(node == -1) {
            return;
        }

        inOrder(arr[node][0]);
        System.out.print((char)(node + 'A'));
        inOrder(arr[node][1]);
    }

    private static void postOrder(int node) {
        if(node == -1) {
            return;
        }

        postOrder(arr[node][0]);
        postOrder(arr[node][1]);
        System.out.print((char)(node + 'A'));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[26][2];

        for(int i = 0; i < n; i++) {
            String[] temp  = br.readLine().split(" ");
            int node = temp[0].charAt(0) - 'A';
            char leftNode = temp[1].charAt(0);
            char rightNode = temp[2].charAt(0);

            if(leftNode == '.') {
                arr[node][0] = -1;
            } else {
                arr[node][0] = leftNode - 'A';
            }

            if(rightNode == '.') {
                arr[node][1] = -1;
            } else {
                arr[node][1] = rightNode - 'A';
            }
        }

        preOrder(0);
        System.out.println();
        inOrder(0);
        System.out.println();
        postOrder(0);
    }
}

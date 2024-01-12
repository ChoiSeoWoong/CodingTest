package 트리;

import java.util.*;
import java.io.*;

public class 문자열집합 {
    static class Node {
        Node[] next = new Node[26];
        boolean isEnd;
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        String[] strArr = new String[n];
//        int count = 0;
//
//        for(int i = 0; i < n; i++) {
//            strArr[i] = br.readLine();
//        }
//
//        for(int i = 0; i < m; i++) {
//            String text = br.readLine();
//
//            for(int j = 0; j < strArr.length; j++) {
//                if(strArr[j].equals(text)) {
//                    count++;
//                    break;
//                }
//            }
//        }
//
//        System.out.println(count);
        // 트라이

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Node root = new Node();

        while(n > 0) {
            String text = br.readLine();
            Node now = root;

            for(int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);

                if(now.next[c - 'a'] == null) {
                    now.next[c - 'a'] = new Node();
                }

                now = now.next[c - 'a'];

                if(i == text.length() - 1) {
                    now.isEnd = true;
                }
            }

            n--;
        }

        int count = 0;

        while(m > 0) {
            String text = br.readLine();
            Node now = root;

            for(int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);

                if(now.next[c - 'a'] == null) {
                    break;
                }

                now = now.next[c - 'a'];

                if(i == text.length() - 1 && now.isEnd) {
                    count++;
                }
            }

            m--;
        }

        System.out.println(count);
    }
}

package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 백준_단어정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for(int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 단어의 길이가 같다면 단어 자체(문자열)에 대하여 오름차순 정렬
                if(o1.length() == o2.length())
                    return o1.compareTo(o2);
                // 단어의 길이가 다른 경우 길이에 관하여 오름차순 정렬
                else
                    return o1.length() - o2.length();
            }
        });

        System.out.println(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if(!arr[i].equals(arr[i - 1]))
                System.out.println(arr[i]);
        }
    }
}


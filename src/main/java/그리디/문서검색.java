package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 문서검색 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String docu = br.readLine();
        String word = br.readLine();
        String[] arr = docu.split(word);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        System.out.println((docu.length() - sb.toString().length()) / word.length());
    }
}

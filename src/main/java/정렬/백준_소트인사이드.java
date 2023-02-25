package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 백준_소트인사이드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        String s = String.valueOf(n);
        String[] sArr = s.split("");

        Arrays.sort(sArr, Comparator.reverseOrder());

        for(int i = 0; i < sArr.length; i++) {
            sb.append(sArr[i]);
        }

        System.out.println(sb.toString());
    }
}

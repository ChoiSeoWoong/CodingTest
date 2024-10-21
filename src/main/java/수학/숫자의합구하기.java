package 수학;

import java.io.*;

public class 숫자의합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int n = Integer.parseInt(br.readLine());

        String s = br.readLine();
        String[] arr = s.split("");

        for(int i = 0; i < arr.length; i++) {
            result += Integer.parseInt(arr[i]);
        }

        System.out.println(result);
    }
}

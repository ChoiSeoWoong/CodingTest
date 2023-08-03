package 구현;

import java.util.*;
import java.io.*;

public class ZOAC4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArr = br.readLine().split(" ");
        int h = Integer.parseInt(strArr[0]);
        int w = Integer.parseInt(strArr[1]);
        int n = Integer.parseInt(strArr[2]);
        int m = Integer.parseInt(strArr[3]);

        int height = (h - 1) / (n + 1) + 1;
        int width = (w - 1) / (m + 1) + 1;

        System.out.println(height * width);
    }
}

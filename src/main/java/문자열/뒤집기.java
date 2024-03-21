package 문자열;

import java.util.*;
import java.io.*;

public class 뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int zeroCnt = 0;
        int oneCnt = 0;

        if(s.charAt(0) == '0') {
            oneCnt++;
        } else {
            zeroCnt++;
        }

        for(int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) != s.charAt(i + 1)) {
                if(s.charAt(i + 1) == '1') {
                    zeroCnt++;
                } else {
                    oneCnt++;
                }
            }
        }

        System.out.println(Math.min(zeroCnt, oneCnt));
    }
}

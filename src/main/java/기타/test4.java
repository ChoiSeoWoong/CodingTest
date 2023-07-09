package 기타;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class test4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputArr = br.readLine().split(" ");

        if(inputArr.length == 1) {
            System.out.println("<" + inputArr[0] + "></" + inputArr[0] + ">\n");
        }

    }
}

package 그리디;

import java.io.*;
import java.util.*;

public class 잃어버린괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split("[-]");
        int result = 0;

        for(int i = 0; i < arr.length; i++) {
            String[] splitArr = arr[i].split("[+]");
            int sum = 0;

            for(int j = 0; j < splitArr.length; j++) {
                sum += Integer.parseInt(splitArr[j]);
            }

            if(i == 0) {
                result += sum;
            } else {
                result -= sum;
            }
        }

        System.out.println(result);
    }
}

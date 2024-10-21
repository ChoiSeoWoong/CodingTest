package 수학;

import java.io.*;

public class 삼각형과세변 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            int max = -1;

            for(int i = 0; i < arr.length; i++) {
                int num = Integer.parseInt(arr[i]);

                if(max < num) {
                    max = num;
                }
            }

            if(a == 0 && b == 0 && c == 0) {
                break;
            }

            if(max >= a + b) {
                System.out.println("Invalid");
            } else if (a == b && b == c && c == a) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || c == a) {
                System.out.println("Isosceles");
            } else if (max < a + b || max < b + c || max < c + a) {
                System.out.println("Scalene");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}


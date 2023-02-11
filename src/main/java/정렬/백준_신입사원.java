package 정렬;

import java.util.*;

public class 백준_신입사원 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] rankArray = new int[n];
            int count = 1;

            for(int j = 0; j < n; j++) {
                int score = sc.nextInt();
                int rank = sc.nextInt();
                rankArray[score - 1] = rank;
            }

            int minValue = rankArray[0];

            for(int k = 1; k < n; k++) {
                if(rankArray[k] < minValue) {
                    minValue = rankArray[k];
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}

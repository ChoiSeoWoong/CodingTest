package 그리디;

import java.util.*;

public class 백준_거스름돈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] remainMoney = {500, 100, 50, 10, 5, 1};

        int price = sc.nextInt();
        price = 1000 - price;
        int totalCnt = 0;

        for (int remain : remainMoney) {
            int cnt = 0;
            if (remain > price)
                continue;

            else {
                cnt += price / remain;
                price -= (remain * cnt);
                totalCnt += cnt;
            }

            if (price == 0)
                break;
        }

        System.out.println(totalCnt);
    }
}

package 그리디;

import java.util.*;

public class 백준_동전0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> moneyAl = new ArrayList<>();
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            int money = sc.nextInt();
            moneyAl.add(money);
        }

        Collections.sort(moneyAl, Collections.reverseOrder());

        for(int i = 0; i < moneyAl.size(); i++) {
            if(moneyAl.get(i) > k) {
                continue;
            }

            else {
                int moneyCnt = k / moneyAl.get(i);
                cnt += moneyCnt;
                k -= moneyAl.get(i) * moneyCnt;

                if(k == 0)
                    break;
            }
        }

        System.out.println(cnt);
    }
}

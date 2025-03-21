package 구현;

public class 프로그래머스_부족한금액계산하기 {
    class Solution {
        public long solution(int price, int money, int count) {
            long answer = -1;
            long total = 0;

            for(int i = 0; i < count; i++) {
                total += price * (i + 1);
            }

            System.out.println(total);
            answer = total - money;

            if(answer < 0)
                return 0;

            return answer;
        }
    }
}

package 완전탐색;

import java.util.ArrayList;

public class 프로그래머스_모의고사 {
    class Solution {
        public int[] solution(int[] answers) {
            int[] player1 = {1, 2, 3, 4, 5};
            int[] player2 = {2, 1, 2, 3, 2, 4, 2, 5};
            int[] player3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            int[] cntList = {0, 0, 0};
            int[] indexList = {0, 0, 0};
            int index = 0;
            int maxValue = 0;
            int k = 0;

            for(int i = 0; i < answers.length; i++) {
                if(player1[indexList[0]++] == answers[i]) {
                    cntList[0] += 1;
                }

                if(player2[indexList[1]++] == answers[i]) {
                    cntList[1] += 1;
                }

                if(player3[indexList[2]++] == answers[i]) {
                    cntList[2] += 1;
                }

                if(indexList[0] >= player1.length) {
                    indexList[0] = 0;
                }

                if(indexList[1] >= player2.length) {
                    indexList[1] = 0;
                }

                if(indexList[2] >= player3.length) {
                    indexList[2] = 0;
                }
            }

            for(int i = 0; i < cntList.length; i++) {
                if(maxValue < cntList[i]) {
                    maxValue = cntList[i];
                }
            }

            for(int i = 0; i < cntList.length; i++) {
                if(maxValue == cntList[i]) {
                    index += 1;
                }
            }

            int[] answer = new int[index];

            index = 0;

            for(int i = 0; i < cntList.length; i++) {
                if(maxValue == cntList[i]) {
                    answer[index] = k + 1;
                    index++;
                    k++;
                }
            }

            //System.out.println(Arrays.toString(answer));

            return answer;
        }
    }
}

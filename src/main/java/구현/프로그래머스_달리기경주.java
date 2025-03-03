package 구현;

import java.util.*;

public class 프로그래머스_달리기경주 {
    class Solution {
        public String[] solution(String[] players, String[] callings) {
            Map<String, Integer> rankMap = new HashMap<>();

            for(int i = 0; i < players.length; i++) {
                rankMap.put(players[i], i);
            }

            for(int i = 0; i < callings.length; i++) {
                int index = rankMap.get(callings[i]);
                String forwardPlayer = players[index - 1];

                players[index - 1] = callings[i];
                rankMap.put(callings[i], index - 1);

                players[index] = forwardPlayer;
                rankMap.put(forwardPlayer, index);
            }

            return players;
        }
    }
}

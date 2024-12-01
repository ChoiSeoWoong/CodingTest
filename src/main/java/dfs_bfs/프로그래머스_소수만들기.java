package dfs_bfs;

import java.util.*;

public class 프로그래머스_소수만들기 {
    class Solution {
        static int answer = 0;
        static int result = 0;

        public boolean isPrimeNumber(int number) {
            for(int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i == 0) {
                    return false;
                }
            }

            return true;
        }

        public void dfs(int[] nums, boolean[] visited, int index, int cnt) {
            if(cnt == 3) {
                for(int i = 0; i < nums.length; i++) {
                    if(visited[i]) {
                        System.out.print(nums[i] + " ");
                        result += nums[i];
                    }
                }

                System.out.println(result);

                if(isPrimeNumber(result)) {
                    answer++;
                }

                return;
            }

            for(int i = index; i < nums.length; i++) {
                visited[i] = true;
                dfs(nums, visited, i + 1, cnt + 1);
                visited[i] = false;
                result = 0;
            }
        }

        public int solution(int[] nums) {
            Arrays.sort(nums);
            boolean[] visited = new boolean[nums.length];
            dfs(nums, visited, 0, 0);

            return answer;
        }
    }
}

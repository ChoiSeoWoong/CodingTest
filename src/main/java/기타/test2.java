package 기타;

import java.io.*;
import java.util.*;

public class test2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int num = Integer.parseInt(input);
        Map<String, Integer> countMap = new HashMap<>();
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            int compare = countMap.get(b) - countMap.get(a);
            if(compare == 0)
                return a.compareTo(b);

            return compare;
        });

        for(int i = 0; i < num; i++) {
            String[] inputArr = br.readLine().split(" ");

            if (inputArr[0].equals("enqueue")) {
                countMap.put(inputArr[1], countMap.getOrDefault(inputArr[1], 0) + 1);
                pq.add(inputArr[1]);

            } else {
                String data = pq.poll();
                countMap.put(data, countMap.get(data) - 1);
                System.out.print(data + " ");

                if (pq.isEmpty()) {
                    System.out.print("*" + " ");
                }
            }
        }
    }
}

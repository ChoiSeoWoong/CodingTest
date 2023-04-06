package 기타;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        ArrayList<Integer> answer = new ArrayList<>();

        String[] strMemberNum = br.readLine().split(" ");
        int[] memberNum = new int[strMemberNum.length];

        for(int i = 0; i < strMemberNum.length; i++) {
            memberNum[i] = Integer.parseInt(strMemberNum[i]);
        }

        for(int i = 0; i < memberNum.length; i++) {
            if(num <= memberNum.length) {
                if(!answer.contains(memberNum[i])) {
                    answer.add(memberNum[i]);
                }

                else {
                    answer.remove(Integer.valueOf(memberNum[i]));
                }
            }

            else {
                if(!answer.contains(memberNum[i])) {
                    answer.add(memberNum[i]);
                }
            }
        }

        Collections.sort(answer);

        for(int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
    }
}

package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 백준_나이순정렬 {
    static class User {
        int age;
        String name;
        int cnt;

        User(int age, String name, int cnt) {
            this.age = age;
            this.name = name;
            this.cnt = cnt;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<User> al = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            al.add(new User(age, name, i));
        }

        Collections.sort(al, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if(o1.age == o2.age) {
                    return o1.cnt - o2.cnt;
                }

                else {
                    return o1.age - o2.age;
                }
            }
        });

        for(int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i).age + " " + al.get(i).name);
        }
    }
}

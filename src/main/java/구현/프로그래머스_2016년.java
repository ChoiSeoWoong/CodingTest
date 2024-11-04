package 구현;

import java.util.*;
import java.time.*;

public class 프로그래머스_2016년 {
    class Solution {
        public String solution(int a, int b) {
            String answer = "";
            String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

            LocalDate date = LocalDate.of(2016, a, b);
            DayOfWeek dof = date.getDayOfWeek();
            int index = dof.getValue();

            return day[index - 1];
        }
    }
}

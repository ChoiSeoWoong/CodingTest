package 기타;

import java.util.*;

public class test {
    public static void main(String[] args) {
        // 유물 무기 기준
        // k : 강화 수치 v : 성공 확률
        Map<Integer,Double> relicsWeaponMap = Map.ofEntries(
                Map.entry(3,70.0),
                Map.entry(4,70.0),
                Map.entry(5,50.0),
                Map.entry(6,50.0),
                Map.entry(7,40.0),
                Map.entry(8,40.0),
                Map.entry(9,35.0),
                Map.entry(10,35.0),
                Map.entry(11,25.0),
                Map.entry(12,25.0),
                Map.entry(13,15.0),
                Map.entry(14,10.0),
                Map.entry(15,6.0),
                Map.entry(16,3.0),
                Map.entry(17,1.0),
                Map.entry(18,1.0),
                Map.entry(19,0.5),
                Map.entry(20,0.5)
        );

        for (Integer key : relicsWeaponMap.keySet()) {
            Double percent = relicsWeaponMap.get(key);
            double v = percent * 0.50;

            long round = Math.round(50 / v);
            System.out.println(key+"강 "+" 횟수 : "+ round);
        }

        // 유물 방어구 기준
        // k : 강화 수치 v : 성공 확률
        Map<Integer,Double> relicsArmorMap = Map.ofEntries(
                Map.entry(3,70.0),
                Map.entry(4,70.0),
                Map.entry(5,50.0),
                Map.entry(6,50.0),
                Map.entry(7,40.0),
                Map.entry(8,40.0),
                Map.entry(9,35.0),
                Map.entry(10,35.0),
                Map.entry(11,25.0),
                Map.entry(12,25.0),
                Map.entry(13,15.0),
                Map.entry(14,10.0),
                Map.entry(15,6.0),
                Map.entry(16,3.0),
                Map.entry(17,1.0),
                Map.entry(18,1.0),
                Map.entry(19,0.5),
                Map.entry(20,0.5)
        );

        for (Integer key : relicsArmorMap.keySet()) {
            Double percent = relicsArmorMap.get(key);
            double v = percent * 0.50;

            long round = Math.round(50 / v);
            System.out.println(key+"강 "+" 횟수 : "+ round);
        }

        // 아브 고대 무기 기준
        // k : 강화 수치 v : 성공 확률
        Map<Integer,Double> ancientAbrelWeaponMap = Map.ofEntries(
                Map.entry(4,45.0),
                Map.entry(5,45.0),
                Map.entry(6,45.0),
                Map.entry(7,30.0),
                Map.entry(8,30.0),
                Map.entry(9,30.0),
                Map.entry(10,15.0),
                Map.entry(11,15.0),
                Map.entry(12,10.0),
                Map.entry(13,10.0),
                Map.entry(14,5.0),
                Map.entry(15,5.0),
                Map.entry(16,4.0),
                Map.entry(17,4.0),
                Map.entry(18,3.0),
                Map.entry(19,3.0),
                Map.entry(20,1.5),
                Map.entry(21,1.5),
                Map.entry(22,1.0),
                Map.entry(23,1.0),
                Map.entry(24,0.5),
                Map.entry(25,0.5)
        );

        for (Integer key : ancientAbrelWeaponMap.keySet()) {
            Double percent = ancientAbrelWeaponMap.get(key);
            double v = percent * 0.50;

            long round = Math.round(50 / v);
            System.out.println(key+"강 "+" 횟수 : "+ round);
        }

        // 아브 고대 방어구 기준
        // k : 강화 수치 v : 성공 확률
        Map<Integer,Double> ancientAbrelArmorMap = Map.ofEntries(
                Map.entry(4,45.0),
                Map.entry(5,45.0),
                Map.entry(6,45.0),
                Map.entry(7,30.0),
                Map.entry(8,30.0),
                Map.entry(9,30.0),
                Map.entry(10,15.0),
                Map.entry(11,15.0),
                Map.entry(12,10.0),
                Map.entry(13,10.0),
                Map.entry(14,5.0),
                Map.entry(15,5.0),
                Map.entry(16,4.0),
                Map.entry(17,4.0),
                Map.entry(18,3.0),
                Map.entry(19,3.0),
                Map.entry(20,1.5),
                Map.entry(21,1.5),
                Map.entry(22,1.0),
                Map.entry(23,1.0),
                Map.entry(24,0.5),
                Map.entry(25,0.5)
        );

        for (Integer key : ancientAbrelArmorMap.keySet()) {
            Double percent = ancientAbrelArmorMap.get(key);
            double v = percent * 0.50;

            long round = Math.round(50 / v);
            System.out.println(key+"강 "+" 횟수 : "+ round);
        }

        // 일리아칸 고대 무기 기준
        // k : 강화 수치 v : 성공 확률
        Map<Integer,Double> ancientAkanWeaponMap = Map.ofEntries(
                Map.entry(4,45.0),
                Map.entry(5,45.0),
                Map.entry(6,45.0),
                Map.entry(7,30.0),
                Map.entry(8,30.0),
                Map.entry(9,30.0),
                Map.entry(10,15.0),
                Map.entry(11,15.0),
                Map.entry(12,10.0),
                Map.entry(13,10.0),
                Map.entry(14,5.0),
                Map.entry(15,5.0),
                Map.entry(16,4.0),
                Map.entry(17,4.0),
                Map.entry(18,3.0),
                Map.entry(19,3.0),
                Map.entry(20,1.5),
                Map.entry(21,1.5),
                Map.entry(22,1.0),
                Map.entry(23,1.0),
                Map.entry(24,0.5),
                Map.entry(25,0.5)
        );

        for (Integer key : ancientAkanWeaponMap.keySet()) {
            Double percent = ancientAkanWeaponMap.get(key);
            double v = percent * 0.50;

            long round = Math.round(50 / v);
            System.out.println(key+"강 "+" 횟수 : "+ round);
        }

        // 일리아칸 고대 무기 기준
        // k : 강화 수치 v : 성공 확률
        Map<Integer,Double> ancientAkanArmorMap = Map.ofEntries(
                Map.entry(4,45.0),
                Map.entry(5,45.0),
                Map.entry(6,45.0),
                Map.entry(7,30.0),
                Map.entry(8,30.0),
                Map.entry(9,30.0),
                Map.entry(10,15.0),
                Map.entry(11,15.0),
                Map.entry(12,10.0),
                Map.entry(13,10.0),
                Map.entry(14,5.0),
                Map.entry(15,5.0),
                Map.entry(16,4.0),
                Map.entry(17,4.0),
                Map.entry(18,3.0),
                Map.entry(19,3.0),
                Map.entry(20,1.5),
                Map.entry(21,1.5),
                Map.entry(22,1.0),
                Map.entry(23,1.0),
                Map.entry(24,0.5),
                Map.entry(25,0.5)
        );

        for (Integer key : ancientAkanArmorMap.keySet()) {
            Double percent = ancientAkanArmorMap.get(key);
            double v = percent * 0.50;

            long round = Math.round(50 / v);
            System.out.println(key+"강 "+" 횟수 : "+ round);
        }
    }
}

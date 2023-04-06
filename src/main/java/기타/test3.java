package 기타;

import java.io.*;
import java.util.*;

public class test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        List<Integer> indexAl = new ArrayList<>();
        List<String> referAl = new ArrayList<>();
        Map<Integer, String> treeMap = new TreeMap<>();
        int index = 1;

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '[') {
                indexAl.add(i);
            }

            else if(input.charAt(i) == ']') {
                indexAl.add(i);
            }
        }

        for(int i = 0; i < indexAl.size() - 1; i += 2) {
            String subStr = input.substring(indexAl.get(i), indexAl.get(i + 1) + 1);
            String subStr1 = subStr.substring(2);
            String subStr2 = subStr1.substring(0, subStr1.length() - 2);
            String[] reference = subStr2.split(", ");

            for(int j = 0; j < reference.length; j++) {
                if(!referAl.contains(reference[j])) {
                    referAl.add(reference[j]);
                    treeMap.put(index++, reference[j]);
                }
            }
        }

        for(int key : treeMap.keySet()) {
            if(input.contains(treeMap.get(key))) {
                String strKey = String.valueOf(key);
                input = input.replaceAll(treeMap.get(key), strKey);
            }
        }

        indexAl.clear();

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '[') {
                indexAl.add(i);
            }

            else if(input.charAt(i) == ']') {
                indexAl.add(i);
            }
        }

        for(int i = 0; i < indexAl.size() - 1; i += 2) {
            String subStr = input.substring(indexAl.get(i), indexAl.get(i + 1) + 1);
            String subStr1 = subStr.substring(2);
            String subStr2 = subStr1.substring(0, subStr1.length() - 2);
            String[] reference = subStr2.split(", ");
            String text = "";
            Arrays.sort(reference);

            for(int j = 0; j < reference.length; j++) {
                text += reference[j] + ", ";
            }
            text = text.substring(0, text.length() - 2);
            input = input.replaceAll(subStr2, text);
        }

        System.out.println(input);

        for(int key : treeMap.keySet()) {
            System.out.println("[" + key + "] " + treeMap.get(key));
        }
    }
}

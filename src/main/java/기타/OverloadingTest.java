package 기타;

import java.util.*;

public class OverloadingTest {
    public static String print(Set<?> set) {
        return "Set";
    }

    public static String print(List<?> list) {
        return "List";
    }

    public static String print(Collection<?> collection) {
        return "Etc";
    }

    public static void main(String[] args) {
        Collection<?>[] collections = {new HashSet<String>(), new ArrayList<Integer>()};

        for (Collection<?> collection : collections) {
            System.out.println(print(collection));
        }
    }
}

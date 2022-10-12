package problems;

import java.util.*;

public class Problem1207 {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3};

        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {

        List<Integer> list1 = new ArrayList<>();

        for (int j : arr) {
            list1.add(j);
        }

        Collections.sort(list1);

        List<Integer> list2 = new ArrayList<>();

        int count = 1;

        for (int i = 0; i < list1.size() - 1; i++) {
            if (list1.get(i).equals(list1.get(i + 1))) {
                count++;
            } else {
                list2.add(count);
                count = 1;
            }
        }

        list2.add(count);

        for (int i = 0; i < list2.size(); i++) {
            if (list2.indexOf(list2.get(i)) != list2.lastIndexOf(list2.get(i))) {
                return false;
            }

        }

        return true;
    }
}

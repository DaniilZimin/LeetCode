package problems;

import java.util.ArrayList;
import java.util.List;

public class Problem830 {
    public static void main(String[] args) {

        System.out.println(largeGroupPositions("abcdddeeeeaabbbcd"));

    }

    public static List<List<Integer>> largeGroupPositions(String s) {

        List<List<Integer>> list = new ArrayList<>();

        List<Integer> numList = new ArrayList<>();

        if (s.length() == 3) {
            if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)) {
                numList.add(0);
                numList.add(2);

                list.add(numList);
                return list;
            }
        }

        for (int i = 1; i < s.length() - 1; i++) {

            if (s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == s.charAt(i + 1)) {
                if (numList.isEmpty()) {
                    numList.add(i - 1);
                }

                if (numList.size() > 1) {
                    numList.remove(1);
                    numList.add(i + 1);
                } else {
                    numList.add(i + 1);
                }

            } else if (!numList.isEmpty()) {
                list.add(numList);
                numList = new ArrayList<>();
            }


        }

        if (!numList.isEmpty()) {
            list.add(numList);
        }

        return list;
    }
}

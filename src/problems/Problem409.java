package problems;

import java.util.*;

public class Problem409 {
    public static void main(String[] args) {

        Set<Integer> ints = new LinkedHashSet<>();

        ints.add(1);
        ints.add(12);
        ints.add(10);
        ints.add(23);
        ints.add(0);
        ints.add(-13);
        ints.add(5);
        ints.add(null);

        System.out.println(ints);

        String s = "abccccddrrr";

        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        Collections.sort(list);

        int count = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            if (list.get(i) == list.get(i + 1)) {
                count += 2;
                i++;
            }
        }

        if (count < s.length()) {
            count++;
        }

        return count;
    }
}

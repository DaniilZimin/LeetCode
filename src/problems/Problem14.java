package problems;

import java.util.Arrays;
import java.util.Comparator;

public class Problem14 {
    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};
        String[] strs1 = {"dog", "racecar", "car"};

        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(strs1));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder s2 = new StringBuilder("");

        String min = Arrays.stream(strs)
                .min(Comparator.comparing(String::length))
                .orElse("Ошибка!");

        for (int j = 0; j < min.length(); j++) {

            char c = 0;

            for (String str : strs) {

                c = strs[0].charAt(j);

                if (c != str.charAt(j)) {
                    return s2.toString();
                }
            }
            s2.append(c);
        }
        return s2.toString();
    }
}

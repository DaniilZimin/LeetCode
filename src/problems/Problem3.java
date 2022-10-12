package problems;

import java.util.HashSet;
import java.util.Set;

public class Problem3 {

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {

        if (s.length() == 1) {
            return 1;
        }
        if (s.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<>();

        int max = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            set.add(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                    if (set.size() > max) {
                        max = set.size();
                    }
                } else {
                    set.clear();
                    break;

                }
            }
        }
        return max;
    }
}


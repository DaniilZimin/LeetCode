package problems;

import java.util.ArrayList;
import java.util.List;

public class Problem383 {

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "abb"));

    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        if (magazine.contains(ransomNote)) {
            return true;
        }


        char[] mag = magazine.toCharArray();
        List<Character> chars = new ArrayList<>();

        for (char c : mag) {
            chars.add(c);
        }

        char[] ran = ransomNote.toCharArray();

        for (char c : ran) {

            if (!chars.contains(c)) {
                return false;
            }

            chars.remove((Character) c);
        }

        return true;
    }
}

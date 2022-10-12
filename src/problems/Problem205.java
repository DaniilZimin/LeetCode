package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Problem205 {
    public static void main(String[] args) {

        System.out.println(isIsomorphic("privet", "kak dela"));
    }

    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!Objects.equals(mapS.putIfAbsent(s.charAt(i), i),
                    mapT.putIfAbsent(t.charAt(i), i))) {
                return false;
            }
        }
        return true;
    }
}

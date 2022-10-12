package problems;

public class Problem392 {
    public static void main(String[] args) {

        System.out.println(isSubsequence("aaaa", "bbbb"));
    }

    public static boolean isSubsequence(String s, String t) {
        int index = 0;
        for (char c : s.toCharArray()) {
            if ((index = t.indexOf(c, index) + 1) == 0)
                return false;
        }
        return true;
    }
}

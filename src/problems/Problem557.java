package problems;

public class Problem557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {

        String[] ss = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < ss.length; i++) {

            StringBuilder p = new StringBuilder(ss[i]).reverse();
            result.append(p);

            if (i != ss.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}


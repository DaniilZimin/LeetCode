package problems;

public class Problem1668 {
    public static void main(String[] args) {
        String s1 = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String s2 = "aaaba";

        System.out.println(maxRepeating(s1, s2));

    }

    public static int maxRepeating(String sequence, String word) {

        int res = 0;

        String s = word;

        while (sequence.contains(s)) {

            res++;

            s = s + word;

        }
        return res;
    }
}

package problems;

public class Problem1662 {
    public static void main(String[] args) {

        String[] s1 = {"av", "c"};
        String[] s2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(s1, s2));

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String s : word1) {
            sb1.append(s);
        }

        for (String s : word2) {
            sb2.append(s);
        }

        return sb1.toString().equals(sb2.toString());

    }
}

package problems;

public class Problem58 {
    public static void main(String[] args) {

        String s = "Hello World";

        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {

        String[] a = s.split(" ");

        return a[a.length - 1].length();
    }
}

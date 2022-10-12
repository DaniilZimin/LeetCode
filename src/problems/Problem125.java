package problems;

public class Problem125 {
    public static void main(String[] args) {
        String a = "A man, a plan, a canal: Panama";
        String a1 = "0P";

        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome(a1));
    }

    public static boolean isPalindrome(String s) {

        String ss = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        String revers = new StringBuilder(ss).reverse().toString();

        return ss.equals(revers);
    }
}

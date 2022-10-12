package problems;

public class Problem9 {
    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(121234235));
        System.out.println(isPalindrome(12344321));
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);

        String s1 = new StringBuilder()
                .append(s)
                .reverse()
                .toString();

        return s.equals(s1);
    }
}

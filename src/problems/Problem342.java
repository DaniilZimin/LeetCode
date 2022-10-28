package problems;

public class Problem342 {

    public static void main(String[] args) {

        System.out.println(isPowerOfFour(66));
    }

    public static boolean isPowerOfFour(int n) {

        if (n == 4 || n == 1) {
            return true;
        }

        while (n > 4) {
            if (n % 4 != 0) {
                return false;
            }
            n = n / 4;

            if (n == 4) {
                return true;
            }
        }

        return false;
    }
}

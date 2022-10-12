package problems;

public class Problem231 {
    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(276));
    }

    public static boolean isPowerOfTwo(int n) {

        if (n == 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        int a = n / 2;

        while (true) {
            if (a % 2 != 0) {
                return false;
            }

            a = a / 2;

            if (a == 1) {
                return true;
            }
        }
    }
}

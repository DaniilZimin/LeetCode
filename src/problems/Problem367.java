package problems;

public class Problem367 {
    public static void main(String[] args) {

        System.out.println(isPerfectSquare(17));

    }

    public static boolean isPerfectSquare(int num) {

        if(num == 1 || num == 2) {
            return true;
        }

        for (int i = 1; i < 100000; i++) {
            if (num / i == i && num != i && num % i == 0) {
                return true;
            }
        }
        return false;

    }
}

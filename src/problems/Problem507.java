package problems;

public class Problem507 {

    public static void main(String[] args) {

        System.out.println(checkPerfectNumber(27));

    }


    public static boolean checkPerfectNumber(int num) {

        int[] nums = {6, 28, 496, 8128, 33550336};

        for (int j : nums) {

            if (num == j) {
                return true;
            }
        }

        return false;
    }
}

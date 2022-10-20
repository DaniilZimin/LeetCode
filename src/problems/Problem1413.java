package problems;

import java.util.Arrays;

public class Problem1413 {
    public static void main(String[] args) {

        int[] nums = {-3, 2, -3, 4, 2};

        System.out.println(minStartValue(nums));
    }

    public static int minStartValue(int[] nums) {

        for (int i = 1; i < 10000; i++) {

            boolean b = true;
            int res = i;

            for (int num : nums) {
                res += num;

                if (res < 1) {
                    b = false;
                    break;
                }
            }
            if (b) {
                return i;
            }
        }

        return 1;
    }
}

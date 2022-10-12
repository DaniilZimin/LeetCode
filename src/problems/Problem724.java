package problems;

import java.util.Arrays;

public class Problem724 {
    public static void main(String[] args) {

        int[] nums = {1, 7, 3, 6, 5, 6};

        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }
        int[] sum = new int[nums.length];
        int[] sum1 = Arrays.copyOf(nums, nums.length);

        sum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum[i] = nums[i] + sum[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            sum1[i] = sum1[i] + sum1[i + 1];
        }

        if (sum1[1] == 0) {
            return 0;
        }

        for (int i = 1; i < sum.length - 1; i++) {
            if (sum[i - 1] == sum1[i + 1]) {
                return i;
            }
        }

        if (sum[sum.length - 2] == 0) {
            return sum.length - 1;
        }

        return -1;
    }
}

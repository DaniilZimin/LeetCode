package problems;

import java.util.Arrays;

public class Problem283 {

    public static void main(String[] args) {

        int[] nums = {0, 0, 0, 0, 0, 0, 1, 1, 1};

        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {

        int d = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[d] = nums[i];
                if (i != d) {
                    nums[i] = 0;
                }
                d++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}

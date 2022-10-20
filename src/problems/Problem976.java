package problems;

import java.util.Arrays;

public class Problem976 {

    public static void main(String[] args) {

        int[] nums = {240, 120, 120, 119, 118};
        System.out.println(largestPerimeter(nums));
    }

    public static int largestPerimeter(int[] nums) {

        Arrays.sort(nums);

        for (int i = nums.length - 1; i > 1; i--) {

            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }

        return 0;
    }
}

package problems;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {

        int[] nums = {-3, 0, 9, 3, 4};

        System.out.println(Arrays.toString(twoSum(nums, 5)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices = new int[2];
                    indices[0] = nums[i];
                    indices[1] = nums[j];
                }
            }
        }
        return indices;
    }
}

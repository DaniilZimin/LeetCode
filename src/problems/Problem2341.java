package problems;

import java.util.Arrays;

public class Problem2341 {

    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 1, 3, 2, 2};

        System.out.println(Arrays.toString(numberOfPairs(nums)));
    }

    public static int[] numberOfPairs(int[] nums) {

        int[] res = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && nums[i] != -1) {
                    res[0] = res[0] + 1;
                    nums[i] = -1;
                    nums[j] = -1;
                    break;
                }
            }
        }

        int count = 0;

        for (int num : nums) {
            if (num != -1) {
                count++;
            }
        }

        res[1] = count;

        return res;
    }
}

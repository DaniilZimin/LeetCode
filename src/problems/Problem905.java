package problems;

import java.util.Arrays;

public class Problem905 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 4, 5, 6, 6};

        System.out.println(Arrays.toString(sortArrayByParity(nums)));

    }

    public static int[] sortArrayByParity(int[] nums) {

        int[] res = new int[nums.length];

        for (int i = 0, a = 0, j = nums.length - 1; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                res[a] = nums[i];
                a++;
            } else {
                res[j] = nums[i];
                j--;
            }
        }

        return res;
    }
}

package problems;

public class Problem896 {
    public static void main(String[] args) {

        int[] nums = {6, 5, 4, 4, 3, 7, 2};

        System.out.println(isMonotonic(nums));
    }

    public static boolean isMonotonic(int[] nums) {

        boolean res1 = true;
        boolean res2 = true;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] < nums[i + 1]) {
                res1 = false;
                break;
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] > nums[i + 1]) {
                res2 = false;
                break;
            }
        }

        return res1 || res2;
    }
}

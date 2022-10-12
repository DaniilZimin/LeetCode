package problems;

public class Problem35 {
    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};

        System.out.println(searchInsert(nums, 8));
        System.out.println(searchInsert(nums, 0));
        System.out.println(searchInsert(nums, 5));
    }

    public static int searchInsert(int[] nums, int target) {

        if (target < nums[0]) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (i > 0 && nums[i - 1] < target && target < nums[i]) {
                return i;
            }
        }

        return nums.length;
    }
}
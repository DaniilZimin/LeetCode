package problems;

public class Problem162 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int[] nums1 = {1, 2};

        System.out.println(findPeakElement(nums));
        System.out.println(findPeakElement(nums1));
    }

    public static int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        if (nums[0] > nums[1]) {
            return 0;
        }

        if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }
        int result = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if ((nums)[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                result = i;
            }
        }
        return result;
    }
}


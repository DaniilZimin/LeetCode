package problems;

import java.util.Set;
import java.util.TreeSet;

public class Problem268 {
    public static void main(String[] args) {

        int[] nims = {9, 8, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println(missingNumber(nims));
    }

    public static int missingNumber(int[] nums) {

        if (nums.length == 1 && nums[0] == 0) {
            return 1;
        }

        if (nums.length == 1 && nums[0] == 1) {
            return 0;
        }

        Set<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i < nums.length; i++) {

            if (!set.contains(i)) {
                return i;
            }
        }

        return nums.length;
    }
}
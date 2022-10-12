package problems;

import java.util.HashMap;
import java.util.Map;

public class Problem219 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 2, 3};

        System.out.println(containsNearbyDuplicate(nums, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            Integer j = map.put(nums[i], i);

            if (j != null && i - j <= k) {
                return true;
            }
        }

        return false;
    }
}

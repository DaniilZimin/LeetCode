package problems;

import java.util.*;

public class Problem217 {
    public static void main(String[] args) {

        int[] nums = {1,2,2,2,3,4,5,6,7,8,8,8,8};

        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }
}

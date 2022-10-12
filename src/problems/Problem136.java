package problems;

import java.util.*;

public class Problem136 {
    public static void main(String[] args) {

        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();

        long sum = 0;

        for (int num : nums) {
            if (set.add(num)) {
                sum += num;
            } else {
                sum -= num;
            }
        }

        return (int) sum;
    }
}
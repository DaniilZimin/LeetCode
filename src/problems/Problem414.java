package problems;

import java.util.Set;
import java.util.TreeSet;

public class Problem414 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 5, 3, 5};

        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {

        int max = Integer.MIN_VALUE;
        int result = Integer.MIN_VALUE;

        Set<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
        }

        boolean b = false;

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                max = set.stream().max(Integer::compareTo).orElseThrow();
                set.remove(max);
            }
            if (i == 1 && !set.isEmpty()) {
                set.remove(set.stream().max(Integer::compareTo).get());
            }
            if (i == 2 && !set.isEmpty()) {
                result = set.stream().max(Integer::compareTo).get();
                b = true;
            }
        }

        if (b) {
            return result;
        }

        return max;
    }
}

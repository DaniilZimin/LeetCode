package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem628 {

    public static void main(String[] args) {

        System.out.println(maximumProduct(new int[]{-1, -2, -3, -4}));
    }

    public static int maximumProduct(int[] nums) {

        if(nums.length == 3){
            return nums[0] * nums[1] * nums[2];
        }

        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();

        list.add(nums[0]);
        list.add(nums[1]);
        list.add(nums[2]);
        if (nums.length > 3) {
            list.add(nums[nums.length - 1]);
        }
        if (nums.length > 4) {
            list.add(nums[nums.length - 2]);
        }
        if (nums.length > 5) {
            list.add(nums[nums.length - 3]);
        }

        int sum = Integer.MIN_VALUE;

        for (int i = 0; i < list.size() - 2; i++) {
            for (int j = i + 1; j < list.size() - 1; j++) {
                for (int k = j + 1; k < list.size(); k++) {
                    int prSum = list.get(i) * list.get(j) * list.get(k);
                    if (prSum > sum) {
                        sum = prSum;
                    }
                }
            }
        }

        return sum;

    }


}

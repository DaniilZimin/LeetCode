package problems;


public class Problem26 {

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {

        if(nums.length==0) return 0;
        int i=0;
        for(int num:nums){
            if(i==0 || num>nums[i-1]){
                nums[i++]=num;
            }
        }
        return i;
    }
}

package problems;

public class Problem334 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;

        for(int n : nums) {
            if(n <= max1){
                max1 = n;
            }else if(n <= max2){
                max2 = n;
            }else{
                return true;
            }
        }
        return false;
    }
}

package problems;

public class Problem485 {
    public static void main(String[] args) {

        int[] array = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(array));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;

        int promMax = 0;


        for (int num : nums) {

            if (num == 1) {
                promMax++;
            }

            if (promMax > max) {
                max = promMax;
            }

            if (num == 0) {
                promMax = 0;
            }

        }

        return max;

    }
}

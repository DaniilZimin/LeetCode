package problems;

public class Problem1323 {

    public static void main(String[] args) {

        System.out.println(maximum69Number(9669));
    }

    public static int maximum69Number(int num) {

        int a = num;

        int iter = 1;

        int res;

        int max = num;

        while (a > 0) {
            if (a % 10 == 9) {
                res = num - (3 * iter);
            } else {
                res = num + (3 * iter);
            }
            if (res > max) {
                max = res;
            }
            iter *= 10;
            a = a / 10;

        }

        return max;
    }
}

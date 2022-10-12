package problems;

import java.util.Arrays;

public class Problem66 {

    public static void main(String[] args) {

        int[] result = {8, 7, 4, 6, 9, 9, 9, 9, 9};

        System.out.println(Arrays.toString(plusOne(result)));
    }

    public static int[] plusOne(int[] digits) {

        int[] res = new int[digits.length];
        boolean b = true;

        for (int i = 0; i < res.length; i++) {
            if (digits[i] == 9) {
                continue;
            }
            b = false;
            break;
        }

        if (b) {
            res = Arrays.copyOf(res, res.length + 1);
            res[0] = 1;
            return res;
        }

        boolean e = true;
        for (int i = res.length - 1; i >= 0; i--) {
            if (digits[i] == 9 && e) {
                res[i] = 0;
                continue;
            }

            if (e) {
                res[i] = digits[i] + 1;
                e = false;
                continue;
            }

            res[i] = digits[i];
        }
        return res;
    }
}
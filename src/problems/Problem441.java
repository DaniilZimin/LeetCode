package problems;

public class Problem441 {

    public static void main(String[] args) {

        System.out.println(arrangeCoins(8));
    }


    public static int arrangeCoins(int n) {
        int res = 0;

        for (int i = 1; i <= n; i++) {

            if (n - i >= 0) {
                res++;
            }
            n -= i;
        }

        return res;
    }
}

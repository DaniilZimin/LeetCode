package problems;

public class Problem202 {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {

        int c = 0;

        for (int i = n; i > 0; i = i / 10) {

            int kv = (i % 10) * (i % 10);

            c = c + kv;

        }

        System.out.println(c);

        int d;
        for (int i = 0; i <= 5; i++) {

            d = (c % 10) * (c % 10);

            c = c / 10;

            d = d + ((c % 10) * (c % 10));

            c = c / 10;

            d = d + ((c % 10) * (c % 10));

            c = d;

            System.out.println(d);
            if (d == 1) {
                return true;
            }
        }

        return false;


    }
}

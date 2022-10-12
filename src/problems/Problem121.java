package problems;

public class Problem121 {
    public static void main(String[] args) {

        int[] prices = {1, 2};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;//1
        int profit = 0;

        for (int price : prices) {

            if (price < min) {
                min = price;
            } else if (price - min > profit) {
                profit = price - min;
            }
        }

        return profit;
    }
}


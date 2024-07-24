public class stocksMaxProfit {
    public static void main(String[] args) {
        int [] age = {7,1,5,3,6,4};
        System.out.println(maxProfit(age));
    }
    public static int maxProfit(int[] prices) {
        int minimum = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length ; i++) {

            int cost = prices[i] - minimum;

            profit = Integer.max(cost,profit);

            minimum = Integer.min(minimum,prices[i]);

        }
        return profit;
    }
}

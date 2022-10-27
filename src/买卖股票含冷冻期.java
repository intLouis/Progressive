public class 买卖股票含冷冻期 {

    public static void main(String[] args) {
        maxProfit(new int[]{6, 1, 3, 2, 4, 7});
    }

    static int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][3];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        dp[0][2] = 0;
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][1] - prices[i], dp[i - 1][0]);
            dp[i][0] = Math.max(dp[i][0], dp[i - 1][2] - prices[i]);

            dp[i][1] = dp[i - 1][0] + prices[i];
            dp[i][2] = dp[i - 1][1];
        }
        return Math.max(Math.max(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2]);
    }
}

public class 股票的最大利润_20220228 {


    public int maxProfit(int[] prices) {
        if (prices.length ==0) {
            return 0;
        }
        int res = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(prices[i], minPrice);
            res = Math.max(res, prices[i] - minPrice);
        }
        return res;
    }

}

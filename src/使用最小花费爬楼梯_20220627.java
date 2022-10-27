public class 使用最小花费爬楼梯_20220627 {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{10, 15, 20}));
    }
    static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        int[] dp2 = new int[cost.length];
        dp[0] = 0;
        dp[1] = cost[0];
        dp2[1] = 0;
        dp2[2] = cost[1];
        for(int i = 2; i < cost.length; i++){
            dp[i] = Math.min(dp[i - 2] + cost[i - 2],dp[ i - 1] + cost[i - 1]);
            System.out.println(dp[i]);
        }
        for(int i = 3; i < cost.length; i++){
            dp2[i ] = Math.min(dp2[i - 2] + cost[i - 2],dp2[ i - 1] + cost[i - 1]);
            System.out.println(dp2[i]);
        }

        return dp[cost.length - 1];
    }
}

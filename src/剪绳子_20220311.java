public class 剪绳子_20220311 {


    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 0;
        dp[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            //绳子第一段剪成j这么长
            for (int j = 2; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }
}

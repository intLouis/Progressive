public class 连续子数组的最大和_20220301 {


    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length + 1];
        dp[1] = nums[0];
        int res = nums[0];
        for (int i = 2; i < nums.length + 1; i++) {
            if (dp[i - 1] < 0) dp[i] = nums[i - 1];
            if (dp[i - 1] >= 0) dp[i] = dp[i - 1] + nums[i - 1];
            res = Math.max(res, dp[i]);
        }

        return res;
    }
}

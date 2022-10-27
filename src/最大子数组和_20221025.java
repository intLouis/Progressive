import java.util.UUID;

public class 最大子数组和_20221025 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int res = nums[0];
        for (int i = 1; i < len; i++) {
            if (nums[i] >= 0) {
                if (dp[i - 1] >= 0) dp[i] = dp[i - 1] + nums[i];
                else dp[i] = nums[i];
            } else {
                dp[i] = nums[i];
            }
            res = Math.max(res, dp[i]);
        }

        return res;
    }

}

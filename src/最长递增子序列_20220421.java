import java.util.Arrays;

public class 最长递增子序列_20220421 {
    public static void main(String[] args) {
        lengthOfLIS(new int[]{1, 3, 6, 7, 9, 4, 10, 5, 6});
    }

    static int lengthOfLIS(int[] nums) {
        //dp定义：以i结尾的最长不重复子串
        int[] dp = new int[nums.length];
        // Arrays.fill(dp, 1);
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            System.out.println(dp[i]);
        }
        return dp[nums.length - 1];
    }
}

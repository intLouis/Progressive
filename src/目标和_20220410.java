import java.util.Arrays;

public class 目标和_20220410 {

    public static void main(String[] args) {
        findTargetSumWays(new int[]{1000}, -1000);
    }

    static int findTargetSumWays(int[] nums, int target) {

        int S = (Arrays.stream(nums).sum() + target);
        if(S % 2 != 0 || Math.abs(target) > Arrays.stream(nums).sum()) return 0;
        S = S / 2;
        int[] dp = new int[S + 1];
        dp[0] = 1;
        //外层遍历物品
        for(int i = 0; i < nums.length; i++){
            //内层遍历背包
            for(int j = S; j - nums[i] >= 0; j--){
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[S];
    }
}

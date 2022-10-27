public class 最大子数组和_20220426 {

    public static void main(String[] args) {
        maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }

    static int maxSubArray(int[] nums) {
        int n = nums.length;
        int res = nums[0];
        int[] dp = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = i; j >= 0; j--){
                if( i == j) {
                    dp[i] = nums[i];
                }else{
                    dp[i] = dp[i - 1] + nums[i];
                }
                res = Math.max(res, dp[i]);
            }
        }
        return res;
    }
}

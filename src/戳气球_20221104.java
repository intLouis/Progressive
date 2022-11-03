public class 戳气球_20221104 {
    public int maxCoins(int[] nums) {
        int len = nums.length;

        int[] newNums = new int[len + 2];
        newNums[0] = newNums[len + 1] = 1;
        for(int i = 1; i <= len; i++){
            newNums[i] = nums[i - 1];
        }

        //dp[i][j] 表示i,j区间内最大能获得的金币
        int[][] dp = new int[len + 2][len + 2];

        //遍历顺序，这样的顺序设计是因为要先计算出已知状态，来推导后面的状态
        //i从下到上
        for(int i = len; i >= 0; i--){
            //j从左到右
            for(int j = i + 1; j < len + 2; j++){
                //遍历最后可能戳破的气球k
                for(int k = i + 1; k < j; k++){
                    dp[i][j] = Math.max(
                            dp[i][j],
                            dp[i][k] + dp[k][j] + newNums[i] * newNums[k] * newNums[j]
                    );
                }
            }
        }
        return dp[0][len + 1];
    }
}

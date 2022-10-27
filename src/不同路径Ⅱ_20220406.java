public class 不同路径Ⅱ_20220406 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int len = obstacleGrid.length;
        int[][] dp = new int[len][obstacleGrid[0].length];
        dp[0][0] = 1;
        for (int k = 1; k < len; k++) obstacleGrid[k][0] = dp[k - 1][0];
        for (int q = 1; q < obstacleGrid[0].length; q++) obstacleGrid[0][q] = dp[q - 1][0];
        for (int i = 1; i < len; i++) {
            for (int j = 1; j < obstacleGrid[i].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[len - 1][obstacleGrid[0].length - 1];
    }
}

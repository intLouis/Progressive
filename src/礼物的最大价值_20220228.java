public class 礼物的最大价值_20220228 {

    public int maxValue(int[][] grid) {
        int i = grid.length + 1, j = grid[0].length + 1;
        int[][] dp = new int[i][j];
        for (int i1 = 1; i1 < i; i1++) {
            for (int i2 = 1; i2 < j; i2++) {
                dp[i1][i2] = grid[i1 - 1][i2 - 1] + Math.max(dp[i1 - 1][i2], dp[i1][i2 - 1]);
            }
        }
        return dp[grid.length][grid[0].length];
    }
}

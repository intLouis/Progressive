import java.lang.reflect.Array;
import java.util.Arrays;

public class 完全平方数_20220413 {
    public static void main(String[] args) {
        numSquares(12);
    }

    static int numSquares(int n) {
        int target = (int) Math.sqrt(n);
        //物品
        int[] things = new int[target];
        for (int k = 1; k <= target; k++) {
            things[k - 1] = k * k;
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, 10000);
        dp[0] = 0;
        for (int i = 0; i < things.length; i++) {
            for (int j = 1; j <= n; j++) {
                if (j - things[i] >= 0) {
                    dp[j] = Math.min(dp[j], dp[j - things[i]] + 1);
                }
            }
        }
        return dp[n];
    }
}

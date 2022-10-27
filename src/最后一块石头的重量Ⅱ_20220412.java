import java.util.Arrays;

public class 最后一块石头的重量Ⅱ_20220412 {

    public static void main(String[] args) {
        lastStoneWeightII(new int[]{4, 3, 4, 3, 2});
    }

    static int lastStoneWeightII(int[] stones) {
        int sum = Arrays.stream(stones).sum();
        int target = sum / 2;
        int[] dp = new int[target + 1];
        for (int i = 0; i < stones.length; i++) {
            for (int j = target; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        return sum - 2 * dp[target];
    }
}

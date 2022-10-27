import java.util.Arrays;

public class 分糖果_20220413 {
    public static void main(String[] args) {
        fentangguo(new int[]{1, 2, 4, 4, 5, 6});
    }

    static void fentangguo(int[] candies) {
        int sum = Arrays.stream(candies).sum();
        int target = sum / 2;
        int[] dp = new int[target + 1];
        dp[0] = 0;
        for (int i = 0; i < candies.length; i++) {
            for (int j = target; j >= 0; j--) {
                if (j - candies[i] >= 0) {
                    dp[j] = Math.max(dp[j - candies[i]] + candies[i], dp[j]);
                }
            }
        }
        System.out.println(dp[target]);
    }
}

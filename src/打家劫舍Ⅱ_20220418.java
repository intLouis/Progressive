public class 打家劫舍Ⅱ_20220418 {
    public static void main(String[] args) {
        rob(new int[]{1, 3, 1, 3, 100});
    }

    static int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[1], nums[0]);
        dp2[1] = nums[1];
        dp2[2] = Math.max(nums[1], nums[2]);
        for (int i = 2; i < n - 1; i++) {
            dp1[i] = Math.max(dp1[i - 2] + nums[i], dp1[i - 1]);
        }
        for (int j = 3; j < n; j++) {
            dp2[j] = Math.max(dp2[j - 2] + nums[j], dp2[j - 1]);
        }
        return Math.max(dp1[n - 2], dp2[n - 1]);
    }
}

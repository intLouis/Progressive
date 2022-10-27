public class 最长递增子序列_20220315 {
    public static void main(String[] args) {
        lengthOfLIS(new int[]{1, 3, 6, 7, 9, 4, 10, 5, 6});
    }

    static int lengthOfLIS(int[] nums) {
        //dp数组意义很重要，此处定义为以i结尾的最长递增子串
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[nums.length - 1];
    }

    static int lengthOfLIS1(int[] nums) {
        int[] res = new int[nums.length + 1];
        res[1] = nums[0];
        int len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < res[i - 1]) {
                res[i] = nums[i];
            } else {
                int left = 1;
                int right = len;
                while (left < right){
                    int mid = (left + right) / 2;
                    if (res[mid] > nums[i]){
                        left = mid + 1;
                    }else {
                        right = mid;
                    }
                }
                nums[left] = nums[i];
            }
        }
        return len;
    }
}

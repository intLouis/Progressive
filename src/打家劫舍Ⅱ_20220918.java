public class 打家劫舍Ⅱ_20220918 {
    public static void main(String[] args) {

    }

    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 1) return nums[0];
        int[] dp1 = new int[len + 1];
        dp1[1] = nums[0];

        int[] dp2 = new int[len + 1];
        dp2[2] = nums[1];

        //如果从第一个开始偷，则不能偷最后一个，所以i <= len - 1
        for(int i = 2; i <= len - 1; i++){
            dp1[i] = Math.max(dp1[i - 2] + nums[i - 1], dp1[i - 1]);
        }
        //如果从第二个开始偷，则可以偷最后一个，所以i <= len
        for(int i = 3; i <= len; i++){
            dp2[i] = Math.max(dp2[i - 2] + nums[i - 1], dp2[i - 1]);
        }
        return Math.max(dp1[len - 1], dp2[len]);
    }
}

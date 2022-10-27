public class 跳跃游戏_20220322 {
    public static void main(String[] args) {
        canJump(new int[]{3, 0, 8, 2, 0, 0, 1});
    }

    static boolean canJump(int[] nums) {
        int maxDistance = nums[0];
        for (int i = 0; i <= maxDistance; i++) {
            maxDistance = Math.max(nums[i] + i,maxDistance);
            if (maxDistance >= nums.length - 1) return true;
        }
        return false;
    }
}

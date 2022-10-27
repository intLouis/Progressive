public class 跳跃游戏Ⅱ_20220625 {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{2, 3, 1, 1, 4}));
    }

    static int jump(int[] nums) {
        int step = 0;
        int maxDistance = 0;
        int bianjie = 0;
        for (int i = 0; i < nums.length; i++) {
            maxDistance = Math.max(nums[i] + i, maxDistance);
//            if (maxDistance >= nums.length - 1) {
//                step++;
//                break;
//            }
            if (i == bianjie) {
                step++;
                bianjie = maxDistance;
            }
        }
        return step;
    }
}

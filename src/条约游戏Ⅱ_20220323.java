import java.util.Arrays;

public class 条约游戏Ⅱ_20220323 {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{2, 3, 1, 1, 4, 2, 1}));
    }

    static int jump(int[] nums) {
        int end = 0;
        int steps = 0;
        int maxDistance = 0;
        for (int i = 0; i < nums.length; i++) {
            maxDistance = Math.max(maxDistance, nums[i] + i);
            if (i == end){
                end = maxDistance;
                steps ++;
            }
        }
        return steps;
    }
}

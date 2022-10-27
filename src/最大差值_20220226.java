import java.util.Arrays;

public class 最大差值_20220226 {

    public 最大差值_20220226() {
    }

    public int maximumDifference(int[] nums) {
        int res = -1;
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] - min > 0) {
                res = Math.max(res, nums[i] - min);
            }
        }
        return res;

    }


}

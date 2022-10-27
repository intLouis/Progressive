
import java.util.Arrays;

public class 最接近的三数之和_20220312 {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-55,-24,-18,-11,-7,-3,4,5,6,9,11,23,33}, 0));
    }

    static int threeSumClosest(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int res = 10000;
        Arrays.sort(nums);
        while (i < j) {
            for (int k = i + 1; k < j; k++) {
                int sum = nums[k] + nums[i] + nums[j];
                int numk = nums[k];
                int numi = nums[i];
                int numj = nums[j];
                int lastAbs = Math.abs(res - target);
                int abs = Math.abs( sum- target);
                if (abs <= lastAbs) {
                    res = sum;
                    if (res == target) break;
                }
            }
            if (res > target) {
                j--;
            } else if (res < target) {
                i++;
            } else break;

        }
        return res;
    }

}

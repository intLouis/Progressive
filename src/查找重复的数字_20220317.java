import java.util.HashSet;

public class 查找重复的数字_20220317 {

    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!integers.add(nums[i])) {
                return nums[i];
            }
        }
        return 0;
    }
}

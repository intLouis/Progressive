import java.util.HashMap;
import java.util.Map;

public class 数组中出现次数超过一半的数字_20220310 {
    public static void main(String[] args) {
        majorityElement(new int[]{-1,1,1,1,2,1});
    }

    static int majorityElement(int[] nums) {
        if (nums.length==1) return nums[0];
        int res = 0;
        int maxNum = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.replace(nums[i], map.get(nums[i]) + 1);
                maxNum=Math.max(maxNum,map.get(nums[i]));
            } else map.put(nums[i], 1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (maxNum == integerIntegerEntry.getValue()) {
                res = integerIntegerEntry.getKey();
            }
        }
        return res;
    }
}

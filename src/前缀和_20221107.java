import java.util.HashMap;
import java.util.Map;

public class 前缀和_20221107 {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 1, 0}, 2));
    }

    //    public static int subarraySum(int[] nums, int k) {
//        int len = nums.length;
//        int[] preSum = new int[len + 1];
//        preSum[0] = 0;
//        for (int i = 1; i <= len; i++) {
//            preSum[i] = preSum[i - 1] + nums[i - 1];
//        }
//
//        int res = 0;
//        for (int right = 1; right <= len; right++) {
//            for (int left = 0; left < right; left++) {
//                if (preSum[right] - preSum[left] == k) {
//                    res++;
//                }
//            }
//        }
//        return res;
//    }
    public static int subarraySum(int[] nums, int k) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
//        map.put(0, 1);

        int res = 0;
        int preSum = 0;
        for (int i = 0; i < len; i++) {
            preSum += nums[i];
            if (map.containsKey(preSum - k)) {
                res++;
            }
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return res;
    }
}

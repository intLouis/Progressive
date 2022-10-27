import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 三数之和 {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-2, 0, 0, 2, 2}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < len - 2; i++){
            if(nums[i] > 0) break;
            if( i > 0 && nums[i] == nums[i - 1] ) continue;
            int left = i + 1;
            int right = len - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
                if(sum > 0) {
                    right--;
                }
                if(sum < 0){
                    left ++;
                }
            }
        }
        return res;
    }

}

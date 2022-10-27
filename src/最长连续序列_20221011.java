import java.util.Arrays;

public class 最长连续序列_20221011 {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{1,2,0,1}));
    }
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int left = 0;
        int maxLen = len > 0 ? 1 : 0;
        for(int i = 1; i < len; i++){
            if(nums[i] == nums[i - 1] + 1){
                maxLen = Math.max(maxLen, i - left + 1);
            }else{
                left = i;
            }
        }
        return maxLen;
    }
}

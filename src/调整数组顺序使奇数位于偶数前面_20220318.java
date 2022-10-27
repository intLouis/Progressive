public class 调整数组顺序使奇数位于偶数前面_20220318 {

    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i < j ){
            if(nums[i]%2 !=0){
                i++;
            }else if(nums[j]%2 ==0){
                j--;
            }else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] =temp;
            }
        }
        return nums;
    }

    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int[] res = new int[2];
        while(i < j){
            if(nums[i] + nums[j] ==target){
                res[0] = (nums[i]);
                res[1] = (nums[j]);
            }
            if(nums[i] + nums[j] <target){
                i++;
            }
            if(nums[i] + nums[j] ==target){
                j--;
            }
        }
        return res;
    }
}

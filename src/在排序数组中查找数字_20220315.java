public class 在排序数组中查找数字_20220315 {
    public static void main(String[] args) {
        System.out.println(search(new int[]{2, 2}, 2));
    }

    static int search(int[] nums, int target) {
        if (nums.length == 1) return nums[0] == target ? 1 : 0;

        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int temp = (i + j) / 2;
            if (target >= nums[temp]) i = temp + 1;
            else j = temp - 1;
        }
        int right = i;
        int left = right -1 ;
        for (int i1 = right - 1; i1 >= 0; i1--) {
            if (nums[i1] == target) {
                left--;
            } else break;
        }

        return right - left - 1;
    }
}

import java.util.ArrayList;
import java.util.List;

public class 多数元素_20221101 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        int candidate1 = nums[0], count1 = 0;
        int candidate2 = nums[0], count2 = 0;
        //摩尔投票
        for (int num : nums) {
            //候选人1匹配上了
            if (candidate1 == num) {
                count1++;
                continue;
            }
            //候选人2匹配上了
            if (candidate2 == num) {
                count2++;
                continue;
            }
            //如果候选人1票数被抵消归零了
            if (count1 == 0) {
                candidate1 = num;
                count1++;
                continue;
            }
            //如果候选人2票数被抵消归零了
            if (count2 == 0) {
                candidate2 = num;
                count2++;
                continue;
            }

            count1--;
            count2--;
        }

        //验证是否大于n/3
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }
        if (count1 > n / 3) res.add(candidate1);
        if (count2 > n / 3) res.add(candidate2);
        return res;
    }
}

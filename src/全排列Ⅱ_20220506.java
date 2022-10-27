import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 全排列Ⅱ_20220506 {
    public static void main(String[] args) {
        全排列Ⅱ_20220506 全排列Ⅱ_20220506 = new 全排列Ⅱ_20220506();
        System.out.println(全排列Ⅱ_20220506.permuteUnique(new int[]{3, 3, 0, 3}));
    }

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(nums, used);
        return res;
    }

    void dfs(int[] nums, boolean[] used) {

        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
            if (used[i]) continue;

            path.add(nums[i]);
            used[i] = true;
            dfs(nums, used);
            used[i] = false;
            path.remove(path.size() - 1);

        }
    }


}

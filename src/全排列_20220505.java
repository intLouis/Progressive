import java.util.ArrayList;
import java.util.List;

public class 全排列_20220505 {
    public static void main(String[] args) {
        全排列_20220505 全排列_20220505 = new 全排列_20220505();
        System.out.println(全排列_20220505.permute(new int[]{1, 1, 2}));
    }

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        dfs(nums, used);
        return res;
    }

    void dfs(int[] nums, boolean[] used) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(nums, used);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }

    }
}

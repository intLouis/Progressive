import java.util.ArrayList;
import java.util.List;

public class 组合总和Ⅱ_20220908 {

    public static void main(String[] args) {
        组合总和Ⅱ_20220908 a = new 组合总和Ⅱ_20220908();
        a.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
    }

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        boolean[] used = new boolean[candidates.length];
        dfs(candidates, target, 0, 0, used);
        return res;
    }

    void dfs(int[] candidates, int target, int startIndex, int sum, boolean[] used) {
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < candidates.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            sum += candidates[i];
            path.add(candidates[i]);
            dfs(candidates, target, startIndex, sum, used);
            path.remove(path.size() - 1);
            sum -= candidates[i];
            used[i] = false;
        }

    }
}

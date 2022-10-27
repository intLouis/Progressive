import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 组合总和 {
    public static void main(String[] args) {
        组合总和 组合总和 = new 组合总和();
        System.out.println(组合总和.combinationSum(new int[]{2, 3, 6, 7}, 7));
    }

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(candidates, target, 0, 0);
        return res;
    }

    void backtracking(int[] candidates, int target, int sum, int startIndex) {
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            path.add(candidates[i]);
            if (sum + candidates[i] > target) {
                break;
            }
            sum += candidates[i];
            backtracking(candidates, target, sum, i);
            sum -= candidates[i];
            path.remove(path.size() - 1);
        }
    }
}

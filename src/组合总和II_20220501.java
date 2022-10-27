import java.util.*;

public class 组合总和II_20220501 {
    public static void main(String[] args) {
        组合总和II_20220501 组合总和II_20220501 = new 组合总和II_20220501();
        System.out.println(组合总和II_20220501.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        boolean[] used = new boolean[candidates.length];

        backtracking(candidates, target, 0, 0, used);
        return res;
    }

    void backtracking(int[] candidates, int target, int sum, int startIndex, boolean[] used) {
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            if (sum + candidates[i] > target) break;
            if (i > 0  && candidates[i] == candidates[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            sum += candidates[i];
            path.add(candidates[i]);
            backtracking(candidates, target, sum, i + 1, used);
            used[i] = false;
            sum -= candidates[i];
            path.remove(path.size() - 1);
        }
    }

}

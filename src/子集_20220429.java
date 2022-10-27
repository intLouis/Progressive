import java.util.ArrayList;
import java.util.List;

public class 子集_20220429 {
    public static void main(String[] args) {
        子集_20220429 子集_20220429 = new 子集_20220429();
        System.out.println(子集_20220429.subsets(new int[]{0}));
    }

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtracking(nums, 0);
        return res;
    }

    void backtracking(int[] nums, int startIndex) {
        if (path.size() > nums.length) return;
        res.add(new ArrayList<>(path));
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            backtracking(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}

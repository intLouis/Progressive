import java.util.*;

public class 子集Ⅱ_20220506 {
    public static void main(String[] args) {
        子集Ⅱ_20220506 子集_20220506 = new 子集Ⅱ_20220506();
        System.out.println(子集_20220506.subsetsWithDup(new int[]{1, 2, 2}));
    }

    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(nums, 0);
        return res;
    }

    void dfs(int[] nums, int startIndex) {
        res.add(new ArrayList<>(path));
        if (path.size() > nums.length) return;

        for (int i = startIndex; i < nums.length; i++) {
            if (i > startIndex && nums[i] == nums[i - 1]) continue;
            path.add(nums[i]);
            dfs(nums, i + 1);
            path.removeLast();

        }
    }
}


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class 组合_20220428 {

    public static void main(String[] args) {
        组合_20220428 组合_20220428 = new 组合_20220428();
        System.out.println(组合_20220428.combine(4, 2));
    }

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtracking(n, k, 1);
        return res;
    }

    void backtracking(int n, int k, int startIndex) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i <= n; i++) {
            path.add(i);
            backtracking(n, k, i + 1);
            path.remove((Integer) i);
        }

    }
}

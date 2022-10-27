import java.util.ArrayList;
import java.util.List;

public class 括号生成_20220820 {
    public static void main(String[] args) {
        括号生成_20220820 q = new 括号生成_20220820();
        System.out.println(q.generateParenthesis(3));
    }
    List<String> res = new ArrayList<>();
    StringBuilder path = new StringBuilder();

    public List<String> generateParenthesis(int n) {
        dfs(n, 0, 0);
        return res;
    }

    void dfs(int n, int left, int right) {
        if (left > n || left < right) return;
        if (path.length() >= 2 * n) {
            res.add(path.toString());
            return;
        }
        path.append("(");
        dfs(n, left + 1, right);
        path.deleteCharAt(path.length() - 1);
        path.append(")");
        dfs(n, left, right + 1);
        path.deleteCharAt(path.length() - 1);

    }
}

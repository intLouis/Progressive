import java.util.ArrayList;
import java.util.List;

public class 括号生成_20220505 {
    public static void main(String[] args) {
        括号生成_20220505 括号生成_20220505 = new 括号生成_20220505();
        System.out.println(括号生成_20220505.generateParenthesis(3));
    }

    List<String> res = new ArrayList<>();
    StringBuilder path = new StringBuilder( );

    public List<String> generateParenthesis(int n) {

        backtracking(n, 0, 0);
        return res;
    }

    void backtracking(int n, int left, int right) {
        if (left == n && right == n) {
            res.add(path.toString());
            return;
        }
        if (left < n) {
            path.append("(");
            backtracking(n, left + 1, right);
            path.deleteCharAt(path.length() - 1);
        }
        if (right < n && left > right) {
            path.append(")");
            backtracking(n, left, right + 1);
            path.deleteCharAt(path.length() - 1);
        }


    }
}

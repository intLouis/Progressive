import java.util.ArrayList;
import java.util.List;

public class 括号_20220803 {
    public static void main(String[] args) {
        括号_20220803 kuo = new 括号_20220803();
        System.out.println(kuo.generateParenthesis(3));
    }
    StringBuilder sb = new StringBuilder();
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs(0, 0, n);
        return res;
    }
    void dfs(int left, int right, int n){
        if(left > n || right > left){
            return;
        }
        if (sb.length() == 2 * n){
            res.add(sb.toString());
            return;
        }
        sb.append("(");
        dfs(left + 1,right, n);
        sb.deleteCharAt(sb.length() - 1);

        sb.append(")");
        dfs(left,right + 1, n);
        sb.deleteCharAt(sb.length() - 1);
    }
}

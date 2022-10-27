import java.util.ArrayList;
import java.util.List;

public class 组合总和Ⅲ_20220509 {
    public static void main(String[] args) {
        组合总和Ⅲ_20220509 组合总和Ⅲ_20220509 = new 组合总和Ⅲ_20220509();
        System.out.println(组合总和Ⅲ_20220509.combinationSum3(3, 9));
    }
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    int sum = 0;
    public List<List<Integer>> combinationSum3(int k, int n) {
        boolean[] used = new boolean[10];

        dfs(k,n,used,1);
        return res;
    }

    void dfs(int k, int n,boolean[] used,int startIndex){

        if(sum == n && path.size() == k){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = startIndex; i <= 9; i++){
            if(sum > n || path.size() > k) break;

            if(!used[i]){
                path.add(i);
                used[i] = true;
                sum += i;
                dfs(k,n,used,i + 1);
                sum -= i;
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
}

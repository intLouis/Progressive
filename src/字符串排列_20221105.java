import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 字符串排列_20221105 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(permutation("sus")));
    }

    public static String[] permutation(String s) {
        String[] str = s.split("");
        List<String> res = new ArrayList<>();
        boolean[] used = new boolean[s.length()];
        Arrays.sort(str);

        dfs(str, res, used, new StringBuilder());

        String[] realRes = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            realRes[i] = res.get(i);
        }

        return realRes;
    }

    static void dfs(String[] str, List<String> res, boolean[] used, StringBuilder item) {
        if (item.length() == str.length) {
            res.add(item.toString());
            return;
        }

        for (int i = 0; i < str.length; i++) {
            if (i > 0 && str[i].equals(str[i - 1]) && !used[i - 1]) {
                continue;
            }
            if (!used[i]) {
                item.append(str[i]);
                used[i] = true;
                dfs(str, res, used, item);
                used[i] = false;
                item.deleteCharAt(item.length() - 1);
            }
        }

    }

}

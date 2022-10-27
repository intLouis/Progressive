import java.util.ArrayList;
import java.util.List;

public class 分割回文串_20220504 {

    public static void main(String[] args) {
        分割回文串_20220504 分割回文串_20220504 = new 分割回文串_20220504();
        System.out.println(分割回文串_20220504.partition("abbab"));
    }

    List<List<String>> res = new ArrayList<>();
    List<String> path = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backtracking(s, 0);
        return res;
    }

    void backtracking(String s, int startIndex) {
        if (startIndex >= s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            if (isHuiwen(s, startIndex, i)) {
                path.add(s.substring(startIndex, i + 1));
            } else {
                continue;
            }

            backtracking(s, i + 1);
            path.remove(path.size() - 1);
        }

    }

    private boolean isHuiwen(String s, int startIndex, int end) {
        int j = end;
        int i = startIndex;
        while (startIndex <= end) {
            if (s.charAt(startIndex) != s.charAt(end)) {
                return false;
            }
            end--;
            startIndex++;
        }
        return true;
    }
}

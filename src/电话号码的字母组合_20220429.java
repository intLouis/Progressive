import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 电话号码的字母组合_20220429 {
    List<String> res = new ArrayList<>();
    String path = "";
    String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        电话号码的字母组合_20220429 电话号码的字母组合_20220429 = new 电话号码的字母组合_20220429();
        System.out.println(电话号码的字母组合_20220429.letterCombinations("23"));
    }

    public List<String> letterCombinations(String digits) {
        if (digits.equals("")) return res;
        backtracking( digits, 0);
        return res;
    }

    void backtracking(String digits, int startIndex) {
        if (path.length() == digits.length()) {
            res.add(path);
            return;
        }
        String str = numString[Integer.parseInt(digits.charAt(startIndex) +"")];
        for (int i = 0; i < str.length(); i++) {
            path += str.charAt(i);
            backtracking(digits, startIndex + 1);
            path = path.substring(0, path.length() - 1);
        }
    }
}

import java.util.Stack;

public class 左旋字符串_20220224 {
    public String reverseLeftWords(String s, int n) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder(s.substring(n));
        stringBuilder.append(s.substring(0, n));
        return stringBuilder.toString();
    }
}

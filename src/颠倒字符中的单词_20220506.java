import java.util.Stack;

public class 颠倒字符中的单词_20220506 {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }

    static String reverseWords(String s) {
        int fast = 0;
        int slow = 0;
        Stack<String> stack = new Stack<>();
        while (fast < s.length()) {
            String s1;
            if (fast == s.length() - 1) {
                s1 = s.substring(slow).replaceAll(" ", "");
                if (s1.length() > 0) stack.push(s1);
            } else if (s.charAt(fast) == ' ') {
                s1 = s.substring(slow, fast).replaceAll(" ", "");
                if (s1.length() > 0) stack.push(s1);
                slow = fast;
            }
            fast++;

        }

        String res = "";
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            String pop = stack.pop();
            res += pop + " ";
        }

        return res.substring(0, res.length() - 1);
    }
}

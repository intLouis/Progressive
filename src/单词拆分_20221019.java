import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class 单词拆分_20221019 {

    public static void main(String[] args) {
        wordBreak("leetcode", List.of("leet", "code"));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        Map<String, Boolean> map = new HashMap<>();
        for (String str : wordDict) {
            map.put(str, true);
        }

        System.out.println(map.toString());
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;
        for (int i = 1; i <= len; i++) {
            for (int j = i - 1; j >= 0; j--) {
                boolean check = map.getOrDefault(s.substring(j, i), false);
                dp[i] = dp[j] && check;
                System.out.println(dp[i] + "," + i);
                if (dp[i]) break;
            }
        }

        return dp[len - 1];
    }
}

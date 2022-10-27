import java.util.Arrays;

public class 回文子串_20220414 {
    public static void main(String[] args) {
        countSubstrings("aaa");
    }
    static int countSubstrings(String s) {
        int n = s.length();
        int res = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
//        Arrays.fill(dp, false);
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 1) {
                        res++;
                        dp[i][j] = true;
                    } else if (dp[i + 1][j - 1]) {
                        res++;
                        dp[i][j] = true;
                    }
                }
            }
        }
        return res;
    }
}

public class 把数字翻译成字符串_20220302 {
    public int translateNum(int num) {

        String s = String.valueOf(num);

        int[] dp = new int[s.length()];
        dp[0] = 1;
        if (s.length()==1) {
            return 1;
        }
        Integer q = Integer.valueOf(s.substring(0, 2));
        if (10 <= q && q <= 25) {
            dp[1] = 2;
        } else {
            dp[1] = 1;
        }
        if (s.length() >= 1) {
            for (int i = 2; i < s.length(); i++) {
                String substring = s.substring(i - 1, i + 1);
                Integer number = Integer.valueOf(substring);

                if (10 <= number && number <= 25) {
                    dp[i] = dp[i - 1] + dp[i - 2];
                } else {
                    dp[i] = dp[i - 1];
                }
            }
        }

        return dp[s.length() - 1];
    }
}

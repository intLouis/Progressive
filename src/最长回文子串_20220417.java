import java.util.Arrays;

public class 最长回文子串_20220417 {
    public static void main(String[] args) {
        longestPalindrome("babad");
    }

    public static String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int maxLen = 1;
        int begin = 0;
        for(int i = 0; i < s.length(); i++){
            dp[i][i] = true; //相等时，元素只有一个，必然是回文串。
            for(int j = 0; j < i; j++){
                if(s.charAt(i) == s.charAt(j)){//如果首位两个字符相同
                    if(i - j < 3) {//首位相等的情况下，如果长度小于3，则一定是回文串。
                        dp[j][i] = true;
                    }else{
                        // if(dp[j + 1][i - 1]){//看看首位字符中间的是否为回文串
                        //     dp[j][i] = true;
                        // }else{//中间不是回文串，则dp[j][i]都不是回文串
                        //     dp[j][i] = false;
                        // }
                        dp[j][i] = dp[j + 1][ i - 1];
                    }
                }else{//首尾不相同
                    dp[j][i] = false;
                }
                System.out.println(dp[j][i]);
                if(dp[j][i] && i - j + 1 > maxLen){
                    maxLen = i - j + 1;
                    begin = j;
                }

            }
        }
        return s.substring(begin, begin + maxLen);
    }
}

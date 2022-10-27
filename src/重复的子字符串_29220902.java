import java.util.Stack;

public class 重复的子字符串_29220902 {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("aabaaba"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        int[] next = new int[len];
        int j = 1;
        //求next 前缀数组
        for(int i = 0; i < len; i++){
            //回退
            while(j > 0 && s.charAt(i) != (s.charAt(j))){
                j = next[j - 1];
            }
            if(s.charAt(i) ==(s.charAt(j))){
                j++;
            }
            next[i] = j;
        }

        return false;
    }
}

public class 判断子序列_20220427 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int i = 0,j = 0;
        while(j < t.length()){
            if(s.charAt(i) == t.charAt(j) && i == s.length() - 1){
                break;
            }
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == s.length() - 1 && j != t.length();
    }
}

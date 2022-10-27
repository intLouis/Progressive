import java.util.HashMap;
import java.util.HashSet;

public class 最长不含重复字符的子字符串_20220301 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abba"));
    }

    static int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0, left = -1;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(map.get(s.charAt(i)),left);
            }
            map.put(s.charAt(i),i);
            res = Math.max(res,i-left);

        }
        return res;
    }
}

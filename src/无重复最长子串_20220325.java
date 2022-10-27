import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class 无重复最长子串_20220325 {
    public static void main(String[] args) {
        lengthOfLongestSubstring("abba");
    }

    static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 ) return 0;
        Map<Character,Integer> map = new HashMap();
        int left = 0;
        int res = 1;
        for(int i = 0; i < s.length(); i++){
            // System.out.println(i);
            if(map.containsKey(s.charAt(i))){
                left = map.get(s.charAt(i)) + 1;
            }
            map.put(s.charAt(i),i);
            res = Math.max(res, i - left + 1);
        }
        return res;
    }

    static int lengthOfLongestSubstring2(String s) {
        int res = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.clear();
            if (s.length() - 1 - i + 1 <= res) break;
            for (int j = i; j < s.length(); j++) {
                if (!set.add(s.charAt(j))) {
                    break;
                } else {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }
}

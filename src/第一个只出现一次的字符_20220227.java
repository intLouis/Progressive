import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class 第一个只出现一次的字符_20220227 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("abaccdeff"));
    }

    public 第一个只出现一次的字符_20220227() {
    }

    static char firstUniqChar(String s) {
        HashSet<Character> set = new HashSet<>();
        LinkedHashMap<Character, Boolean> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.add(s.charAt(i))) {
                map.replace(s.charAt(i), true, false);
            } else {
                map.put(s.charAt(i), true);
            }
        }
        for (Map.Entry<Character, Boolean> characterBooleanEntry : map.entrySet()) {
            if (characterBooleanEntry.getValue() == true) {
                return characterBooleanEntry.getKey();
            }
        }
        return ' ';
    }
}

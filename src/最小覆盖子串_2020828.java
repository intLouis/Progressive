//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class 最小覆盖子串_2020828 {
//    public static void main(String[] args) {
//        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
//    }
//
//
//    static String minWindow(String s, String t) {
//        int sLen = s.length();
//        int tLen = t.length();
//
//        Map<Character, Integer> need = new HashMap<>();
//        for (int i = 0; i < tLen; i++) need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0) + 1);
//
//        int l = 0, r = 0;//窗口给左右边界
//        int needCount = tLen;//需要的字符数
//        int startIndex = 0;//最小覆盖串开始的index
//        int windowSize = Integer.MAX_VALUE;//窗口大小，不断更新
//        //开始遍历
//        while (r < sLen) {
//            char c = s.charAt(r);//当前字符
//
//            //need中保存了需要的每个字符的数量，大于0说明需要当前字符c
//            if (need.get(c) > 0) {
//                needCount--;//需求量-1
//            }
////            need[c]--;
//
//            //当需要的字符串数needCount=0时，说明
//            if (needCount == 0) {
//                //缩小滑动窗口
//                while (l < r && !need.containsKey(s.charAt(l))) {
//                    need[s.charAt(l)]++;
//                    l++;//左边界收缩
//                }
//                if (r - l + 1 < windowSize) {//对比当前窗口是否比上一次窗口更小
//                    windowSize = r - l + 1;
//                    startIndex = l;//更新最小串的左边界起点，作为最终结果的起点
//                }
//                need[s.charAt(l)]++;
//                l++;
//                needCount++;
//            }
//            r++;
//        }
//        return windowSize == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + windowSize);
//    }
//}

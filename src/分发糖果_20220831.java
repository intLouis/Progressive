//import java.util.*;
//
//public class 分发糖果_20220831 {
//    public static void main(String[] args) {
////        candy
//    }
//    public static int candy(int[] ratings) {
//        TreeMap<Integer,List<Integer>> map = new TreeMap<>();
//        for (int i = 0; i < ratings.length; i++) {
//            int rating = ratings[i];
//            //若存在于map
//            if (map.containsKey(rating)){
//                List<Integer> list = map.get(rating);
//                list.add(i);
//                map.put(rating,list);
//            }else {
//                map.put(rating, Arrays.asList(i));
//            }
//        }
//
//    }
//}

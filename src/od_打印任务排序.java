import java.util.*;
import java.util.Scanner;

public class od_打印任务排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item = sc.next();
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        String[] split1 = item.split(",");

        String[] split2 = item.split(",");

        Arrays.sort(split2,Comparator.reverseOrder());


        //任务排序
        for (int i = 0; i < split2.length; i++) {
            map.put(i, Integer.valueOf(split2[i]));
        }
        StringBuilder sb = new StringBuilder();
        for (String s : split1) {
            int index = getIndex(map, Integer.parseInt(s));
            sb.append(index + ",");
        }
        System.out.println(sb.toString().substring(0, sb.length() - 1));
    }

    static int getIndex(LinkedHashMap<Integer, Integer> map, int target) {
        int index = 0;
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> next = iterator.next();
            if (next.getValue() == target) {
                index = next.getKey();
                iterator.remove();
                break;
            }
        }

        return index;
    }

}

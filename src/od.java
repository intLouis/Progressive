import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 给定两个字符集
 */
public class od {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        LinkedHashMap<String, Integer> allStrMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> usedStrMap = new LinkedHashMap<>();
        //默认不存在字符占用
        boolean isUsedFlag = false;
        if (next.length() > 0) {
            String[] all = next.split("@");
            String allStr = all[0];
            //将全量字符串加入map
            String[] allStrChar = allStr.split(",");
            for (String allItem : allStrChar) {
                String[] currStr = allItem.split(":");
                allStrMap.put(currStr[0], Integer.valueOf(currStr[1]));
            }

            if (all.length > 1) {
                String usedStr = all[1];
                //将占用字符串加入map
                String[] userStrChar = usedStr.split(",");
                for (String usedItem : userStrChar) {
                    String[] currStr = usedItem.split(":");
                    usedStrMap.put(currStr[0], Integer.valueOf(currStr[1]));
                }

                //A-B
                for (Map.Entry<String, Integer> entry : allStrMap.entrySet()) {
                    Integer integer = usedStrMap.get(entry.getKey());
                    if (integer != null && integer != 0) {
                        isUsedFlag = true;
                        entry.setValue(entry.getValue() - integer);
                    }
                }
            }


            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Integer> entry : allStrMap.entrySet()) {
                if (entry.getValue() != 0) {
                    sb.append(entry.getKey() + ":" + entry.getValue() + ",");
                }
            }
            String s = sb.toString();
            s = s.substring(0, s.length() - 1);
            if (!isUsedFlag) {

                System.out.println(s + "@");
            } else {
                System.out.println(s);
            }

        }
    }
}

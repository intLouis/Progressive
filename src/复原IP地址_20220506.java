import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 复原IP地址_20220506 {
    public static void main(String[] args) {
//        复原IP地址_20220506 复原IP地址_20220506 = new 复原IP地址_20220506();
//        System.out.println(复原IP地址_20220506.restoreIpAddresses("101023"));
        System.out.println("101023".substring(0, 6));
    }

    List<String> res = new ArrayList<>();
    LinkedList<String> path = new LinkedList<>();

    public List<String> restoreIpAddresses(String s) {
        dfs(s, 0);
        return res;
    }

    void dfs(String s, int starIndex) {

        if (path.size() == 4 && starIndex == s.length()) {
            String curr = "";
            for (int i = 0; i < 4; i++) {
                if (i == 3) curr += path.get(i);
                else curr += path.get(i) + ".";
            }
            res.add(curr);
            return;
        }
        for (int i = starIndex; i - starIndex <= 3 && i < s.length(); i++) {
            String substring = s.substring(starIndex, i + 1);
            // 这个剪枝为实时判断剩下的字符串长度是否超过最大所需长度
            if (s.length() - i > 3 * (4 - path.size())) {
                continue;
            }
            if (isIp(substring)) {
                path.add(substring);
                dfs(s, i + 1);
                path.removeLast();
            } else {
                break;
            }
        }

    }

    boolean isIp(String ip) {
        if (ip.length() == 0) return false;
        if (ip.length() > 1 && (ip.charAt(0) + "").equals("0")) return false;
        return Integer.parseInt(ip) <= 255;
    }
}

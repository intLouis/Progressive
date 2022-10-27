import java.util.ArrayList;
import java.util.List;

public class 圆圈中最后剩下的数字_20220724 {
    public static void main(String[] args) {
        System.out.println(lastRemaining(43, 9001));
    }

    static int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        int flag = -1;
        while (list.size() != 1) {
            int count = 0;
            while (count < m) {
                if (flag >= list.size() - 1) {
                    flag = 0;//回到起点
                } else {
                    flag++;
                }
                count++;//数m次
            }

            list.remove(flag);
            flag--;
        }
        return list.get(0);
    }
}

import java.util.ArrayList;
import java.util.List;

public class 和为s的连续正数序列_20220317 {
    public static void main(String[] args) {
        findContinuousSequence(15);
    }

    static int[][] findContinuousSequence(int target) {
        int i = 1, j = 2, sum = 3;
        List<int[]> res = new ArrayList<>();
        while (i < j) {
            if (sum == target) {
                int[] item = new int[j - i + 1];
                item[0] = i;
                for (int i1 = 1; i1 < item.length; i1++) {
                    item[i1] += item[i1 - 1] + 1;
                }
                res.add(item);
            }
            if (sum < target) {
                j++;
                sum += j;
                continue;
            }
            if (sum >= target) {
                sum -= i;
                i++;
                continue;
            }
        }
        return res.toArray(new int[0][]);

    }
}

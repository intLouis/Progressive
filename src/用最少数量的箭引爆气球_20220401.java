import java.util.Arrays;
import java.util.Comparator;

public class 用最少数量的箭引爆气球_20220401 {
    public static void main(String[] args) {
        findMinArrowShots(new int[][]{{7, 15}, {6, 14}, {8, 12}, {3, 4}, {4, 13}, {6, 14}, {9, 11}, {6, 12}, {4, 13}});
    }

    static int findMinArrowShots(int[][] points) {
        int res = points.length;
        Arrays.sort(points, Comparator.comparing(o -> o[0]));
        int flag = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= flag) {
                flag = Math.min(flag, points[i][1]);
                res--;
            } else {
                flag = points[i][1];
            }
        }
        return res;
    }
}

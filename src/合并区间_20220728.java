import java.util.*;

public class 合并区间_20220728 {


    public int[][] merge(int[][] intervals) {
        int len = intervals.length;
        Stack<int[]> stack = new Stack<>();
        //按照区间左端点排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        stack.push(intervals[0]);
        for (int i = 1; i < len; i++) {
            int[] cur = stack.pop();
            if (intervals[i][1] >= cur[0]) {
                int left = Math.min(intervals[i][0],cur[0]);
                int right = Math.min(intervals[i][1],cur[1]);
                int[] mergeItem = new int[]{left,right};
                stack.push(mergeItem);
            }else {
                stack.push(intervals[i]);
            }
        }
        int[][] res = new int[stack.size()][2];
        for (int i = res.length - 1; i >=0 ; i++) {
            res[i] = stack.pop();
        }
        return res;
    }
}

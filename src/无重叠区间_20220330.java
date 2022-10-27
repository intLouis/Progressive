import java.util.Arrays;
import java.util.Comparator;

public class 无重叠区间_20220330 {

    public static void main(String[] args) {


    }

    static int eraseOverlapIntervals(int[][] intervals) {
        int[] dp = new int[intervals.length];
        dp[0] = 0;
        Arrays.sort(intervals, Comparator.comparing(o -> o[1]));
        for (int i = 1; i < intervals.length; i++) {
            for (int j = 0; j < i; j++) {
                if (intervals[i][0] <= intervals[j][1]) {
                    dp[i] = Math.max(dp[i] + 1, dp[j]);
                }
            }
        }
        return intervals.length - Arrays.stream(dp).max().getAsInt();
    }

    static int eraseOverlapIntervals2(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparing(o -> o[1]));

        int res = 1;
        for(int i = 1;i < intervals.length;i++){
            if(intervals[i][0] >= intervals[i-1][1]){
                res ++;
            }
        }
        return intervals.length - res;
    }
}

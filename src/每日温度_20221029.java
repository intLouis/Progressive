import java.util.Arrays;
import java.util.Map;
import java.util.Stack;

public class 每日温度_20221029 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }

    /**
     * 总体思路单调栈，文字描述较为抽象，可以看https://leetcode.cn/problems/daily-temperatures/solutions/71433/leetcode-tu-jie-739mei-ri-wen-du-by-misterbooo/?orderBy=most_votes
     * 1、读懂题意
     * 2、遍历整个数组，如果栈不空，且当前数字大于栈顶元素，那么如果直接入栈的话就不是 【递减栈】
     * 3、需要取出栈顶元素，由于当前数字大于栈顶元素的数字，而且一定是第一个大于栈顶元素的数，直接求出下标差就是二者的距离
     * @param temperatures
     * @return
     */
    public static int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();
        int len = temperatures.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                Integer pop = stack.pop();
                res[pop] = i - pop;

            }
            stack.push(i);

        }
        return res;
    }
}

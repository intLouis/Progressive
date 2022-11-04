import java.util.Stack;

public class 接雨水_20221105 {
    /**
     * 时刻记住栈保存的是索引
     *
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int len = height.length;
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < len; i++) {
            //找到一个比栈顶大的柱子
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {

                //记录水坑底部高度
                int pitHeight = height[stack.peek()];
                //水坑底部出栈，
                stack.pop();
                //如果栈空了，退出，没有形成氹
                if (stack.isEmpty()) break;

                //找到左墙壁
                int left = height[stack.peek()];
                //右墙壁就是当前下标柱子height[i]
                int right = height[i];
                //左右墙壁取最短，短板效应
                int shortHeight = Math.min(left, right);

                //计算水坑蓄水量
                int water = (shortHeight - pitHeight) * (i - stack.peek() - 1);
                res += water;
            }

            stack.push(i);
        }
        return res;
    }
}

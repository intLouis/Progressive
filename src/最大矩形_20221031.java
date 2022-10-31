import java.util.Stack;

public class 最大矩形_20221031 {
    public static void main(String[] args) {
        System.out.println(maximalRectangle(new char[][]{
                                {'1', '0', '1', '0', '0'},
                                {'1', '0', '1', '1', '1'},
                                {'1', '1', '1', '1', '1'},
                                {'1', '0', '0', '1', '0'}
//                {'0', '1'}, {'1', '0'}
        }));
    }

    /**
     * 本题实则是将二维转一维，每一行都是一道84题，计算柱状图中最大面积
     * @param matrix
     * @return
     */
    public static int maximalRectangle(char[][] matrix) {
        int lenX = matrix[0].length;
        int lenY = matrix.length;
        int res = 0;
        //Y轴遍历
        for (int y = 0; y < lenY; y++) {

            //转换成柱形图
            int[] heights = new int[lenX + 2];
            for (int i = 1; i <= lenX; i++) {
                for (int k = y; k >= 0; k--) {
                    if (matrix[k][i - 1] == '1') heights[i] += 1;
                    else break;
                }
            }
            res = Math.max(res, maxMatrix(heights));
        }
        return res;
    }

    /**
     * 本体为力扣84题，https://leetcode.cn/problems/largest-rectangle-in-histogram/
     * @param heights
     * @return
     */
    public static int maxMatrix(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        int len = heights.length;

        int[] newHeight = new int[len + 2];
        //新数组替换入参数组
        for (int i = 1; i <= len; i++) {
            newHeight[i] = heights[i - 1];
        }

        for (int i = 0; i < newHeight.length; i++) {
            //单调栈，找到当前高度的左右边界：比当前高度小的左边第一个、右边第一个就是左右边界
            while (!stack.isEmpty() && newHeight[i] < newHeight[stack.peek()]) {
                //栈顶元素出栈
                int cur = stack.pop();
                //获取栈顶元素的高度
                int curHeight = newHeight[cur];
                //左边边界，就是当前出栈元素的左边一个。
                int leftIndex = stack.peek();
                //右边边界，当前i下标所指的元素
                int rightIndex = i;
                //计算宽度
                int curWidth = rightIndex - leftIndex - 1;
                //贪心
                res = Math.max(res, curWidth * curHeight);
            }
            stack.push(i);
        }
        return res;
    }
}

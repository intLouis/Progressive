import java.util.Stack;

public class 接雨水_20220725 {
    public static void main(String[] args) {

    }
    static int trap(int[] height) {
        Stack<Integer> stack = new Stack();//栈用于记录下标
        int res = 0;
        for(int i = 0; i < height.length; i++){
            while(!stack.empty() && stack.peek() != null && height[stack.peek()] < height[i]){//栈顶元素比当前遍历元素小
                Integer cur = stack.pop();//
                int l = stack.pop();//左边长方条
                int r = i;//右边较大的长方条
                int waterHeight = Math.min(height[r], height[l]) - height[cur];//计算出水坑高度差值
                res += (r - l  - 1) * waterHeight; //长×高 得出本次结算雨水量。
            }
            stack.push(i);//若当前i下标元素小于等于栈顶，则继续入栈。
        }
        return res;
    }
}

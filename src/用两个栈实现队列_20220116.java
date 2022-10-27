import java.util.Stack;

public class 用两个栈实现队列_20220116 {
    Stack<Integer> stack1, stack2;

    public 用两个栈实现队列_20220116() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public static void main(String[] args) {

    }

    //入栈
    void appendTail(int value) {
        stack1.push(value);
    }

    int deleteHead() {

        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                return -1;
            } else {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
                return stack2.pop();
            }

        } else {
            return stack2.pop();
        }
    }
}

import java.util.Stack;

public class 旋转数组的最小数字_20220227 {
    public 旋转数组的最小数字_20220227() {
    }

    public int minArray(int[] numbers) {
        if (numbers.length == 1) {
            return numbers[0];
        }
        int res = 0;
        Stack stack = new Stack();
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                res = numbers[i];
                break;
            } else {
                res = numbers[0];
            }
        }
        return res;
    }
}

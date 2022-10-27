import java.util.Arrays;
import java.util.Objects;

public class 单调递增数字_20221026 {
    public static void main(String[] args) {
        System.out.println(monotoneIncreasingDigits(332));
    }

    public static int monotoneIncreasingDigits(int n) {
        String num = Objects.toString(n);
        String[] nums = num.split("");
        for (int i = nums.length - 1; i > 0; i--) {
            if (Integer.parseInt(nums[i]) < Integer.parseInt(nums[i - 1])) {
                nums[i - 1] = Objects.toString(Integer.parseInt(nums[i - 1]) - 1);
                nums[i] = "9";
            }
        }

        return Integer.parseInt(String.join("", nums));
    }
}

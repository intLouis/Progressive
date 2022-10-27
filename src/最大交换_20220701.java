
import java.util.Arrays;

public class 最大交换_20220701 {
    public static void main(String[] args) {
        System.out.println(maximumSwap(98368));
    }

    static int maximumSwap(int num) {
        String[] split = String.valueOf(num).split("");

        int[] last = new int[10];
        //记录每个数字最后一次出现的下标
        for (int i = 0; i < split.length; i++) {
            int number = Integer.parseInt(split[i]);
            last[number] = i;
        }

        //遍历数字
        for (int i = 0; i < split.length; i++) {
            //获取当前下标的值
            int currNum = Integer.parseInt(split[i]);
            //逆序遍历0-9这10个数字
            for (int j = 9; j > currNum; j--) {
//                System.out.println(last[j]);
                //last[j] 代表当前数字j在num中出现的下标 ; 遇到比当前值大的，进行交换
                if (last[j] > i) {
                    //交换
                    String temp = split[i];
                    split[i] = String.valueOf(j);
                    split[last[j]] = temp;
                    String res = "";
                    for (int k = 0; k < split.length; k++) {
                        res += split[k];
                    }
                    return Integer.parseInt(res);
                }
            }
        }
        return num;
    }
}

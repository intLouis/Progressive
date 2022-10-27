import java.util.Random;

public class 按权重随机选择_20220830 {
    public static void main(String[] args) {
        new 按权重随机选择_20220830(new int[]{3,14,1,7});
    }
    int[] sum;
    int[] w;
    public 按权重随机选择_20220830(int[] w) {
        sum = new int[w.length + 1];
        this.w = w;
        for(int i = 1; i < sum.length; i++){
            sum[i] = sum[i - 1] + w[i - 1];
        }
    }

    public int pickIndex() {
        int random = new Random().nextInt(sum[w.length]);
        int l = 0;
        int right = w.length - 1;
        while (l < right) {
            int mid = (l + right) / 2;
            if (sum[mid + 1] > random) return mid;
            else l = mid + 1;
        }
//        for(int i = 0; i < w.length; i++){
//            if(random < sum[i + 1]) return i;
//        }
        return l;
    }
}

import java.util.Arrays;

public class 珂珂吃香蕉_20221024 {
    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        //速度下限是1
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (check(piles, mid, h)) r = mid;
            else l = mid + 1;
        }
        return l;
    }

    static boolean check(int[] piles, int k, int h) {
        int totalTime = 0;
        for (int pile : piles) {
            if (pile <= k) {
                totalTime += 1;
            } else {
                System.out.println(pile + " " + k);
                double ceil = Math.ceil(pile / k);

                totalTime += (int) ceil;
            }

            if (totalTime > h) return false;
        }
        return true;
    }
}

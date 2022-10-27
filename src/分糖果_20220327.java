public class 分糖果_20220327 {
    public static void main(String[] args) {
        candy(new int[]{1, 3, 2, 2, 1});
    }

    static int candy(int[] ratings) {
        int res = 1;
        int lastCandies = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]){
                res += lastCandies + 1;
                lastCandies = lastCandies + 1;
            }
            else {
                 if (i == 1) res += 2;
                else res += 1;
                lastCandies = 1;
            }
        }
        return res;
    }
}

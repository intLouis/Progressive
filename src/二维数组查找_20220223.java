public class 二维数组查找_20220223 {
    public 二维数组查找_20220223() {
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int n = matrix[0].length;
        int m = matrix.length;


        int i = m - 1, j = 0;
        while ((i >= 0) && (j <= n - 1)) {
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] < target) {
                j++;
                if (j > n - 1) break;
            }
            if (matrix[i][j] > target) {
                i--;
                if (i < 0) break;
            }
        }
        return false;
    }
}

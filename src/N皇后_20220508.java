import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N皇后_20220508 {
    List<List<String>> res = new ArrayList<>();

    public static void main(String[] args) {
        N皇后_20220508 n皇后_20220508 = new N皇后_20220508();
        System.out.println(n皇后_20220508.solveNQueens(4));
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for (char[] chars : chessboard) {
            Arrays.fill(chars, '.');
        }
        dfs(n, chessboard, 0);
        return res;
    }

    void dfs(int n, char[][] chessboard, int row) {
        if (row == n) {
            res.add(Array2List(chessboard));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isOk(chessboard, row, col)) {
                chessboard[row][col] = 'Q';
                dfs(n, chessboard, row + 1);
                chessboard[row][col] = '.';
            }
        }

    }


    private boolean isOk(char[][] chessboard, int row, int col) {
        //检查当前列是否有皇后
        for (int i = 0; i < chessboard.length; i++) {
            if (chessboard[i][col] == 'Q') {
                return false;
            }
        }
        //检查45对角线是否有皇后
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }
        //检查135对角线是否有皇后
        for (int i = row - 1, j = col + 1; i >= 0 && j <= chessboard.length - 1; i--, j++) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }


    List<String> Array2List(char[][] chessboard) {
        List<String> item = new ArrayList<>();
        for (char[] chars : chessboard) {
            String element = "";
            for (char aChar : chars) {
                element += aChar;
            }
            item.add(element);
        }
        return item;
    }

}

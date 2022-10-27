
public class 单词搜索_20220501 {
    public static void main(String[] args) {
        单词搜索_20220501 单词搜索_20220501 = new 单词搜索_20220501();
        System.out.println(单词搜索_20220501.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED"));
    }

    boolean res = false;
    int[] dx = new int[]{-1, 0, 1, 0}, dy = new int[]{0, 1, 0, -1}; //方向数组

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                backtracking(board, word, 0, i, j);
            }
        }
        return res;
    }

    void backtracking(char[][] board, String word, int wordCharIndex, int x, int y) {
        if (word.charAt(wordCharIndex) != board[x][y]) {
            return;
        }
        if (wordCharIndex == word.length() - 1) {
            res = true;
            return;
        }
        char t = board[x][y];
        board[x][y] = '.';
        for (int i = 0; i < 4; i++) {
            int a = x + dx[i];
            int b = y + dy[i];
            if (a < 0 || b < 0 || a >= board.length || b >= board[0].length || board[a][b] == '.') continue;
            backtracking(board, word, wordCharIndex + 1, a, b);
        }
        board[x][y] = t;

    }
}

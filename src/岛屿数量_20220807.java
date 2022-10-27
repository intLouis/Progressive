public class 岛屿数量_20220807 {
    public static void main(String[] args) {
        char[][] gird = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        岛屿数量_20220807 岛屿数量_20220807 = new 岛屿数量_20220807();
        int i = 岛屿数量_20220807.numIslands(gird);

    }

    int r = 0;
    public int numIslands(char[][] grid) {
        int[][] cache = new int[grid.length][grid[0].length];
        for(int i = 0; i <grid.length; i++ ){
            for(int j = 0; j <grid[0].length; j++ ){
                isGrid(i, j, grid, cache);
            }
        }
        return r;
    }

    void isGrid(int i, int j, char[][] grid, int[][] cache){
        boolean res = true;
        if(i - 1 >= 0 && grid[i][j] == '1') {
            res = false;
            cache[i][j] = cache[i - 1][j];
        }
        if(i + 1 <= grid.length - 1 && grid[i][j] == '1'){
            res = false;
            cache[i][j] = cache[i + 1][j];
        }
        if(j - 1 >= 0 && grid[i][j] == '1'){
            res = false;
            cache[i][j] = cache[i][j - 1];
        }
        if(j + 1 <= grid[0].length - 1 && grid[i][j] == '1'){
            res = false;
            cache[i][j] = cache[i][j + 1];
        }

        if (grid[i][j] == '1' && res) {
            r++;
            cache[i][j] = r;
        }

    }
}

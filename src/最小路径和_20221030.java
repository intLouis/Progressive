public class 最小路径和_20221030 {
        public int minPathSum(int[][] grid) {
            int lenX = grid.length;
            int lenY = grid[0].length;

            for(int i = 0; i < lenX; i++){
                for(int j = 0; j < lenY; j++){
                    if(i == 0 && j == 0) continue;
                    else if(i == 0){
                        grid[i][j] = grid[i][ j - 1] + grid[i][j];
                    }else if(j == 0){
                        grid[i][j] = grid[i - 1][j] + grid[i][j];
                    }else {
                        grid[i][j] = Math.min(grid[i][ j - 1], grid[i - 1][j]) + grid[i][j];
                    }
                }
            }
            return grid[lenX - 1][ lenY - 1];
        }
}

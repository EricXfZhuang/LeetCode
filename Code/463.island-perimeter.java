/*
 * @lc app=leetcode id=463 lang=java
 *
 * [463] Island Perimeter
 */

// @lc code=start
class Solution {
    public int islandPerimeter(int[][] grid) {
        int rs = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    rs = rs + 4 - numAdj(grid, i, j);
                }
            }
        }
        return rs;
    }

    public int numAdj(int[][] grid, int row, int column){
        int rs = 0;
        if(row > 0 && grid[row-1][column]==1)
            rs++;
        if(row+1 < grid.length && grid[row+1][column]==1)
            rs++;
        if(column > 0 && grid[row][column-1]==1)
            rs++;
        if(column+1 < grid[row].length && grid[row][column+1]==1)
            rs++;
        return rs;
    }
}
// @lc code=end


/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {
    boolean[][] visited;
    char[][] myGrid;
    int numIsLand = 0;
    public int numIslands(char[][] grid) {
        if(grid.length==0) return 0;
        visited = new boolean[grid.length][grid[0].length];
        myGrid = grid;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(myGrid[i][j]== '1' && !visited[i][j]){
                    traverse(i, j);
                    numIsLand++;
                }
            }
        }
        return numIsLand;
    }

    public boolean inGrid(int row, int column){
        return row >= 0 && row < myGrid.length && column >= 0 && column < myGrid[0].length;
    }

    public void traverse(int row, int column){
        if(!inGrid(row, column)) return;
        if(myGrid[row][column]== '1' && !visited[row][column]){
            visited[row][column] = true;
            traverse(row+1, column);
            traverse(row-1, column);
            traverse(row, column+1);
            traverse(row, column-1);
        }
    }
}
// @lc code=end


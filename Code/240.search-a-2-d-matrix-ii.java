/*
 * @lc app=leetcode id=240 lang=java
 *
 * [240] Search a 2D Matrix II
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0 || matrix[0].length==0) return false;
        int row = 0; int column = 0;
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        return dfs(visited, matrix, target, row, column);
    }

    public boolean dfs(boolean[][] visited, int[][] matrix, int target, int row, int column){
        if((row < 0 || row > matrix.length-1) || (column < 0 || column > matrix[0].length-1) || visited[row][column]){
            return false;
        }else if(matrix[row][column]==target){
            return true;
        }else if(matrix[row][column] < target){
            visited[row][column] = true;
            boolean result = dfs(visited, matrix, target, row+1, column) || dfs(visited, matrix, target, row, column+1);
            return result;
        }else if(matrix[row][column] > target){
            visited[row][column] = true;
            boolean result = dfs(visited, matrix, target, row-1, column) || dfs(visited, matrix, target, row, column-1);
            return result;
        }else{
            return false;
        }
    }
}
// @lc code=end


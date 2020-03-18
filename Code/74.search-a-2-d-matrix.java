/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        for(int i = 0; i < m; i++){
            if(target >= matrix[i][0] && target <= matrix[i][n-1]){
                for(int j = 0; j < n; j++){
                    if(matrix[i][j] == target) return true;
                }
                return false;
            }
        }        
        return false;
    }
}
// @lc code=end


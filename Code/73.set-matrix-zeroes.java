import java.util.*;
/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        List<int[]> ls = new ArrayList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j]==0) ls.add(new int[]{i,j});
            }
        }
        
        for(int[] point : ls){
            int row = point[0], column = point[1];
            for(int j = 0; j < n; j++) matrix[row][j] = 0;
            for(int i = 0; i < m; i++) matrix[i][column] = 0;
        }
    }
}
// @lc code=end


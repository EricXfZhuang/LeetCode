/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        /**
         * step 1, row[i] = row[len-1-i]
         */
        int len = matrix.length;
        for(int i = 0; i < len/2; i++){
            int[] temp = matrix[i];
            matrix[i] = matrix[len-i-1];
            matrix[len-i-1] = temp;
        }

        /**
         * step 2, column[i] = row[i]
         */
        boolean[][] visited = new boolean[len][matrix[0].length];
        for(int i = 0; i < len; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(!visited[i][j]){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                    visited[i][j] = true;
                    visited[j][i] = true;
                }
            }
        }

    }
}
// @lc code=end


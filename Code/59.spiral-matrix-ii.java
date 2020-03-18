/*
 * @lc app=leetcode id=59 lang=java
 *
 * [59] Spiral Matrix II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int left = 0, right = n-1, top = 0, bottom = n-1;
        while(true){
            for(int i = left; i <= right; i++) matrix[top][i] = num++;
            top++;
            if(left > right || top > bottom) break;

            for(int i = top; i <= bottom; i++) matrix[i][right] = num++;
            right--;
            if(left > right || top > bottom) break;

            for(int i = right; i >= left; i--) matrix[bottom][i] = num++;
            bottom--;
            if(left > right || top > bottom) break;

            for(int i = bottom; i >= top; i--) matrix[i][left] = num++;
            left++;
            if(left > right || top > bottom) break;
        }
        return matrix;
    }
}
// @lc code=end


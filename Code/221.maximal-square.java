/*
 * @lc app=leetcode id=221 lang=java
 *
 * [221] Maximal Square
 */

// @lc code=start
class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0) return 0;
        int[][] dp = new int[matrix.length+1][matrix[0].length+1];
        int maxDimension = 0;
        for(int i = 1; i < matrix.length+1; i++){
            for(int j = 1; j < matrix[i-1].length+1; j++){
                dp[i][j] = Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]);
                if(matrix[i-1][j-1] == '1'){
                    dp[i][j] += 1;
                }else{
                    dp[i][j] = 0;
                }
                if(dp[i][j] > maxDimension) maxDimension = dp[i][j];
            }
        }
        return maxDimension * maxDimension;
    }
}
// @lc code=end


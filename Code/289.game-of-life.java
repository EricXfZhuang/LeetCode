import java.util.*;
/*
 * @lc app=leetcode id=289 lang=java
 *
 * [289] Game of Life
 */

// @lc code=start
class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[] prevRow = new int[n];
        int[] currRow = new int[n];
        int currCol = 0;
        int prevCol = 0;
        for(int i = 0; i < m; i++){
            currRow = board[i].clone();
            for(int j = 0; j < n; j++){
                currCol = board[i][j];
                int count = 0;
                if(j < n-1 && board[i][j+1] == 1) count++;
                if(i < m-1 && board[i+1][j] == 1) count++;
                if(i < m-1 && j < n-1 && board[i+1][j+1] == 1) count++;

                if(j >= 1){
                    if(prevCol == 1) count++;
                    if(i < m-1 && board[i+1][j-1] == 1) count++;
                    if(prevRow[j-1] == 1) count++;
                }

                if(prevRow[j] == 1) count++;
                if(j < n-1 && prevRow[j+1] == 1) count++;

                if(board[i][j] == 1){
                    if(count < 2 || count > 3){
                        board[i][j] = 0;
                    }
                }else{
                    if(count == 3){
                        board[i][j] = 1;
                    }
                }
                prevCol = currCol;
            }
            prevRow = currRow;
        }
    }
}
// @lc code=end


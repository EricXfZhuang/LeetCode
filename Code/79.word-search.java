import java.util.*;
/*
 * @lc app=leetcode id=79 lang=java
 *
 * [79] Word Search
 */

// @lc code=start
class Solution {

    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++) {
                if (search(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return  false;
    }

    boolean search(char[][] board, String word, int row, int column, int wordIndex) {
        if(wordIndex>=word.length()) return true;
        if(row < 0 || column < 0 || row >= board.length || column >= board[0].length || board[row][column]!=word.charAt(wordIndex) || visited[row][column]) return false;
        visited[row][column] = true;
        boolean result = search(board, word, row+1, column, wordIndex+1) || search(board, word, row-1, column, wordIndex+1) || search(board, word, row, column+1, wordIndex+1) || search(board, word, row, column-1, wordIndex+1);
        visited[row][column] = false;
        return result;
    }
}
// @lc code=end


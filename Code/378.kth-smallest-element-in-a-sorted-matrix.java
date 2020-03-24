import java.util.*;
/*
 * @lc app=leetcode id=378 lang=java
 *
 * [378] Kth Smallest Element in a Sorted Matrix
 */

// @lc code=start
class Solution {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                pq.add(matrix[i][j]);
            }
        }
        while(k > 1){
            pq.poll();
            k--;
        }
        return pq.poll();
    }
}
// @lc code=end


/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> rs = new ArrayList<>();
        if(matrix.length == 0 || matrix[0].length == 0 ) return rs;
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = n-1, bottom = m-1, top = 0;
        while(true){
            for(int i = left; i <= right; i++) rs.add(matrix[top][i]);
            top++;
            if(left > right || top > bottom) break;
            
            for(int i = top; i <= bottom; i++) rs.add(matrix[i][right]);
            right--;
            if(left > right || top > bottom) break;
            
            for(int i = right; i >= left; i--) rs.add(matrix[bottom][i]);
            bottom--;
            if(left > right || top > bottom) break;
            
            for(int i = bottom; i >= top; i--) rs.add(matrix[i][left]);
            left++;
            if(left > right || top > bottom) break;
        }
        return rs;
    }
}
// @lc code=end


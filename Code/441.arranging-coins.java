/*
 * @lc app=leetcode id=441 lang=java
 *
 * [441] Arranging Coins
 */

// @lc code=start
class Solution {
    public int arrangeCoins(int n) {
        if(n==0) return 0;
        int row = 1;
        while(n>0){
            n -= row;
            if(n < 0){
                break;
            }
            row++;
        }
        return row-1;

    }
}
// @lc code=end


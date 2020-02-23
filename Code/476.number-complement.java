/*
 * @lc app=leetcode id=476 lang=java
 *
 * [476] Number Complement
 */

// @lc code=start
class Solution {
    public int findComplement(int num) {
        int sum = 0; int expon = 1;
        while(num>0){
            sum += ((num%2) ^ 1)*expon;
            num >>= 1;
            expon *= 2;
        }
        return sum;
    }
}
// @lc code=end


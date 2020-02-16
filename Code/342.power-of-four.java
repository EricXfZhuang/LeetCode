/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int num) {
        if(num==0) return false;
        while(num%4==0){
            if(num == 4)
                return true;
            if(num > 10 && (num%10!=4 && num%10!=6 && num%10!=8))
                return false;
            num/=4;
        }
        return num == 1;
    }
}
// @lc code=end


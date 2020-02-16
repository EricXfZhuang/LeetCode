/*
 * @lc app=leetcode id=263 lang=java
 *
 * [263] Ugly Number
 */

// @lc code=start
class Solution {
    public boolean isUgly(int num) {
        while(num != 1){
            int temp = num;
            if(temp%2 == 0)
                temp /= 2;
            if(temp%3 == 0)
                temp /= 3;
            if(temp%5 == 0)
                temp /= 5;
            if(temp == num)
                return false;
            num = temp;
        }
        return true;
    }
}
// @lc code=end


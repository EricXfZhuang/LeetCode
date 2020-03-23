/*
 * @lc app=leetcode id=357 lang=java
 *
 * [357] Count Numbers with Unique Digits
 */

// @lc code=start
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int range = (int)Math.pow(10, n);
        
        // 计算位数
        int num = range, numDec = 0;
        while(num > 0){
            numDec++;
            num /= 10;
        } 
        
        // compute permutation
        int rs = 1;
        if(numDec == 1) return rs;
        rs = 10;
        if(numDec == 2) return rs;
        rs = 9 * 9;
        if(numDec == 3) return rs + 10;
        int pos = 2;
        int numCand = 8;
        int curr = 9 * 9;
        while(pos < numDec-1){
            curr *= numCand;
            rs += curr;
            numCand--;
            pos++;
        }
        return rs + 10;
    }
}
// @lc code=end


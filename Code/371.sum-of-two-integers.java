/*
 * @lc app=leetcode id=371 lang=java
 *
 * [371] Sum of Two Integers
 */

// @lc code=start
class Solution {
    public int getSum(int a, int b) {
        if(a<b){
            return myRec(a,b);
        }else{
            return myRec(b, a);
        }
    }

    public int myRec(int s, int l){
        if(s==0) return l;
        return myRec(s>>1, l<<1);
    }
}
// @lc code=end


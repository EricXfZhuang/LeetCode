/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1) return;
        int[] cl = nums.clone();
        int len = nums.length;

        if(k%len==0) return;
        k %= len;
        int start = len-k;
        //copy rotated
        for(int i = 0;i<k;i++){
            nums[i] = cl[start++];
        }

        //copy the rest
        int rest = 0;
        for(int j = k;j<len;j++){
            nums[j] = cl[rest++];
        } 

    }
}
// @lc code=end


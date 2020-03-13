import java.util.*;
/*
 * @lc app=leetcode id=581 lang=java
 *
 * [581] Shortest Unsorted Continuous Subarray
 */

// @lc code=start
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] unsorted = nums.clone();
        Arrays.sort(nums);
        int l = 0, r = nums.length-1;
        boolean lfind = false, rfind = false;
        while(l<r){
            if(lfind&&rfind) break;
            if(!lfind && nums[l]!=unsorted[l]){
                lfind = true;
            }else if(!lfind){
                l++;
            }

            if(!rfind && nums[r]!=unsorted[r]){
                rfind = true;
            }else if(!rfind){
                r--;
            }
        }
        if(l==r) return 0;
        return r-l+1;
    }
}
// @lc code=end


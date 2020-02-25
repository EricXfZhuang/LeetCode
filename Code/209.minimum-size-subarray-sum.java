import java.util.*;
/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        // Method 1: Scan from left to right
        // int maxLen = 0;
        // if(nums.length==0) return 0;
        // for(int i = 0;i<nums.length-1;i++){
        //     int frontIndex = i;
        //     int tailIndex = i+1;
        //     int sum = nums[frontIndex];
        //     while(tailIndex<nums.length && sum<s){
        //         sum += nums[tailIndex];
        //         tailIndex++;
        //     }
        //     if(sum>=s){
        //         if(maxLen==0){
        //             maxLen = tailIndex-frontIndex;
        //         }else{
        //             maxLen = maxLen < (tailIndex-frontIndex) ? maxLen : (tailIndex-frontIndex);
        //         }
        //     }
        // }
        // return maxLen;   

        //sliding window 
        int maxLen = nums.length+1;
        int left = 0; int right = -1;
        int sum = 0;
        while(left<nums.length){
            if(sum<s && right<nums.length-1){
                sum += nums[++right];
            }else{
                sum -= nums[left++];
            }

            if(sum>=s){
                maxLen = Math.min(maxLen, right-left+1);
            }
        }
        if(maxLen==nums.length+1) return 0;
        return maxLen;
    }    
}
// @lc code=end


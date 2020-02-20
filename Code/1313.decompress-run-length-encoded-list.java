import java.util.Arrays;

/*
 * @lc app=leetcode id=1313 lang=java
 *
 * [1313] Decompress Run-Length Encoded List
 */

// @lc code=start
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for(int i = 0;i < nums.length;i++){
            if(i%2!=0) continue;
            size+=nums[i];
        }
        int[] result = new int[size]; int start = 0;
        for(int i = 0; i < nums.length-1;i+=2){
            int freq = nums[i];
            for(int j = start;j < freq+start;j++){
                result[j] = nums[i+1];
            }
            start += freq;
        }
        return result;
    }
}
// @lc code=end


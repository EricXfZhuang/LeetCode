import java.util.*;
/*
 * @lc app=leetcode id=228 lang=java
 *
 * [228] Summary Ranges
 */

// @lc code=start
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> rs = new ArrayList<>();
        if(nums.length==0) return rs;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int index = 1;
        while(index < nums.length){
            if(nums[index] == nums[index-1] + 1){
                dp[index] = dp[index-1];
                index++;
            }else{
                if(dp[index-1] != nums[index-1]){
                    rs.add(dp[index-1]+"->"+nums[index-1]);
                }else{
                    rs.add(Integer.toString(nums[index-1]));
                }
                dp[index] = nums[index];
                index++;
            }
        }
        int len = nums.length;
        if(nums[len-1] == dp[len-1])
            rs.add(Integer.toString(nums[len-1]));
        else{
            rs.add(dp[len-1]+"->"+nums[len-1]);
        }
        return rs;

    }
}
// @lc code=end


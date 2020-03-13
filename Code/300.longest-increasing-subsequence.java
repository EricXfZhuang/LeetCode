import java.util.*;
/*
 * @lc app=leetcode id=300 lang=java
 *
 * [300] Longest Increasing Subsequence
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length <= 1) return nums.length;
        List<int[]> seqs = new ArrayList<>();
        seqs.add(new int[]{nums[0]});
        int maxLen = 1;
        for(int i = 1; i < nums.length; i++){
            boolean findSmaller = false;
            int currMax = 0;
            for(int j = i-1; j >= 0; j--){
                if(nums[i] > nums[j]){
                    int[] seq = new int[seqs.get(j).length+1];
                    if(seq.length > currMax){
                        currMax = seq.length;
                    }else{
                        continue;
                    }
                    for(int l = 0; l < seq.length-1; l++){
                        seq[l] = seqs.get(j)[l];
                    }
                    seq[seq.length-1] = nums[i];
                    if(seqs.size()<i+1)
                        seqs.add(seq);
                    else
                        seqs.set(i, seq);
                    findSmaller = true;
                    if(seq.length>maxLen){
                        maxLen = seq.length;
                    }
                }
            }
            if(!findSmaller){
                int[] seq = new int[]{nums[i]};
                seqs.add(seq);
            }
        }
        return maxLen;
    }
}
// @lc code=end


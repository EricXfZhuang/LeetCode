import java.util.*;
/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> rs = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-3; i++){
            for(int j = i+1; j < nums.length-2; j++){
                int l = j+1, r = nums.length-1;
                while(l<r){
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if(sum==target){
                        List<Integer> ls = List.of(nums[i], nums[j], nums[l], nums[r]);
                        set.add(ls);
                       l++; r--;
                    }else if(sum < target){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }
        rs.addAll(set);
        return rs;
    }
}
// @lc code=end


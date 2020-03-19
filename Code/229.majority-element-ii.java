/*
 * @lc app=leetcode id=229 lang=java
 *
 * [229] Majority Element II
 */

// @lc code=start
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> rs = new ArrayList<>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(rs.contains(nums[i])) continue;
            map.compute(nums[i], (key, val) -> val == null ? 0 : val+1);
            if(map.get(nums[i]) >= Math.floor(len/3)){
                rs.add(nums[i]);
            }
        }
        return rs;
    }
}
// @lc code=end


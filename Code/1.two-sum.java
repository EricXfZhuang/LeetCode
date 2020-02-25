/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Method using set
        Map<Integer,Integer> map = new HashMap();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(target-nums[i]) && !map.get(target-nums[i]).equals(i))
                return new int[]{i, map.get(target-nums[i])};
        }
        return null;
    }
}
// @lc code=end


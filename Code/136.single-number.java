import java.util.*;

/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        // if(nums.length<=1) return nums[0];
        // HashMap<Integer, Integer> visited = new HashMap<Integer,Integer>();
        // visited.put(nums[0], 1);
        // for(int i = 1;i < nums.length;i++){
        //     if(!visited.containsKey(nums[i])){
        //         visited.put(nums[i], 1);
        //     }
        //     else{
        //         visited.replace(nums[i], 2);
        //     }
        // }
        // for(Map.Entry<Integer, Integer> entry : visited.entrySet()){
        //     if(entry.getValue()==1)
        //         return entry.getKey();
        // }
        // return -1;
        HashSet<Integer> set = new HashSet<Integer>();
        int sum = 0;
        int sum_set = 0;
        for(int i = 0;i < nums.length;i++){
            set.add(nums[i]);
            sum += nums[i];
        }
        
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()){
            sum_set += iter.next();
        }

        return 2*sum_set-sum;
    }
}
// @lc code=end


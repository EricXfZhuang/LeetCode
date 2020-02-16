import java.util.HashMap;
import java.util.Iterator;

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int times = (int) Math.ceil(nums.length/2);
        for(Integer num : nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,1+map.get(num));
            }
            if(map.get(num)>times) return num;
        }
        return -1;
    }
}
// @lc code=end


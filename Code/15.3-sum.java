import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //for each num1, find 2 element tuple(num2, num3) 
        //such that sum(num2, num3) == 0-num1
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i<nums.length;i++){
            map.put(i, nums[i]);
        }
        List<List<Integer>> ret = new LinkedList<List<Integer>>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                int sum = nums[i]+nums[j];
                if(map.containsValue(-(nums[i]+nums[j]))){
                    Integer[] arr = {nums[i], nums[j], 0-nums[i]-nums[j]};
                    Arrays.sort(arr);
                    List<Integer> ls = Arrays.asList(arr);
                    set.add(ls);
                }
            }
        }
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            ret.add((List<Integer>)iter.next());
        }

        return ret;
    }
}
// @lc code=end


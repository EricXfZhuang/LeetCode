import java.util.*;
/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */
import java.util.Map.Entry;

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0;i<nums1.length;i++){
            if(map.containsKey(nums1[i]))
                map.put(nums1[i],map.get(nums1[i])+1);
            else
                map.put(nums1[i],1);
        }

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                arr.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        int[] ret = new int[arr.size()];
        for(int i = 0;i<arr.size();i++){
            ret[i] = arr.get(i);
        }
        return ret;
    }
}
// @lc code=end


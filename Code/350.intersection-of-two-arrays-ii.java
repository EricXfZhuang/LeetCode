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
        Map<Integer, Integer> map1 = new HashMap();
        Map<Integer, Integer> map2 = new HashMap();
        for(Integer item:nums1){
            map1.putIfAbsent(item, 0);
            map1.put(item, map1.get(item)+1);
        }
        for(Integer item:nums2){
            map2.putIfAbsent(item, 0);
            map2.put(item, map2.get(item)+1);
        }
        List<Integer> ls = new ArrayList();
        for(Map.Entry<Integer, Integer> entry:map1.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            if(map2.containsKey(key)){
                int len = Math.min(val, map2.get(key));
                for(int i = 0;i < len;i++){
                    ls.add(key);
                }
            }
        }
        int[] ret = new int[ls.size()];
        for(int i = 0;i < ret.length;i++){
			ret[i] = ls.get(i);
        }
        return ret;
    }
}
// @lc code=end


import java.util.*;
/*
 * @lc app=leetcode id=496 lang=java
 *
 * [496] Next Greater Element I
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(Integer ele : nums1){
            set.add(ele);
        }
        for(int i = 0;i < nums2.length;i++){
            map.put(nums2[i], i);
        }
        int[] result = new int[nums1.length];
        for(int i = 0;i < nums1.length;i++){
            if(map.get(nums1[i])+1<nums2.length){
                if(nums2[map.get(nums1[i])+1]>nums1[i])
                    result[i] = nums2[map.get(nums1[i])+1];
                else
                    result[i] = -1;
            }else{
                result[i] = -1;
            }
        }
        return result;
    }
}
// @lc code=end


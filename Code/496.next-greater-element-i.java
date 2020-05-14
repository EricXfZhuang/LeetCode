import java.util.*;
/*
 * @lc app=leetcode id=496 lang=java
 *
 * [496] Next Greater Element I
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
            for(int i = 0; i < nums1.length; i++){
                int indexInNums2 = findIndex(nums1[i], nums2);
                int nextGreaterIndex = nextGreaterIndex(indexInNums2, nums2);
                res[i] = nextGreaterIndex > -1 ? nums2[nextGreaterIndex] : -1;
            }
            return res;
    }

    public int findIndex(int ele, int[] nums2){
        for(int i = 0; i < nums2.length; i++){
            if(nums2[i] == ele){
                return i;
            }
        }
        return -1;
    }
    
    public int nextGreaterIndex(int index, int[] nums2){
        int ele = nums2[index];
        int curr = index + 1;
        while(curr < nums2.length){
            if(nums2[curr] > ele){
                return curr;
            }
            curr++;
        }
        return -1;
    }
}
// @lc code=end


import java.util.Arrays;

/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length == 0){
            return;
        }
        int[] temp = nums1.clone();
        int index = 0; int index1 = 0; int index2 = 0;
        while(index < m+n && index1 < m && index2 < n){
            if(temp[index1] < nums2[index2]){
                nums1[index++] = temp[index1++];
            }else{
                nums1[index++] = nums2[index2++];
            }
        }
        int start = 0;
        if(index1 < m){
            start = index1;
            for(int i = start;i < m;i++){
                nums1[index++] = temp[i];
            }
        }
        if(index2 < n){
            start = index2;
            for(int i = start;i < n;i++){
                nums1[index++] = nums2[i];
            }
        }
    }
}
// @lc code=end


import java.util.*;
/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> q = new ArrayList();
        for(int i = 0;i < nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                q.add(0, max);
            }else{
                q.add(findPlace(q, nums[i]), nums[i]);
            }
        }
        return q.get(k-1);
    }

    /**
     * 
     * @param q queue
     * @param ele element to be inserted
     * @return the index of place 
     */
    public int findPlace(ArrayList<Integer> q, int ele){
        for(int i = 0;i<q.size()-1;i++){
            if(q.get(i)>=ele && ele>=q.get(i+1)){
                return i+1;
            }
        }
        return q.size();
    }
}
// @lc code=end


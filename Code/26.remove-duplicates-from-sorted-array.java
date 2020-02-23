import java.util.HashSet;
import java.util.TreeSet;

/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int count = 0;
        int prev = nums[0]; 
        for(int i = 1;i < nums.length;i++){
            if(nums[i]==prev){
                count++;
            }else{
                //swap(i-count, i)
                int temp = nums[i];
                if(count>0){
                    nums[i-count]=nums[i];
                    nums[i] = prev;
                }
                prev = temp;
            }
        }
        // TreeSet<Integer> int_set = new TreeSet<Integer>();
        // for(Integer i : nums){
        //     int_set.add(i);
        // }
        // int len = int_set.size();
        // for(int i = 0;i < len;i++){
        //     nums[i] = int_set.pollFirst();
        // }
        // return len;
        return nums.length-count;
    }
}
// @lc code=end


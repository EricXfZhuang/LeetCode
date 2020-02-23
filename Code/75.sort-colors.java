import java.util.*;
/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        // //bubble sort
        // boolean flag = true;
        // for(int i = 0;i<nums.length;i++){
        //     if(flag==false)
        //         break;
        //     int color = nums[i];
        //     for(int j = 0;j<nums.length-i-1;j++){
        //         if(nums[j]>nums[j+1]){
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;
        //             flag = true;
        //         }
        //     }
            
        // }

        //count map sort
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int ele : nums){
            if(!map.containsKey(ele)) {
                map.put(ele, 1);
            }else{
                map.put(ele, map.get(ele)+1);
            }
        }
        int index = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            while(val>0){
                nums[index++] = key;
                val--;
            }
        }
    
    }
}
// @lc code=end


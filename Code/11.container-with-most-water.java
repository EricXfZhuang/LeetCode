/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int frontIndex = 0; int tailIndex = height.length-1;
        int maxArea = Integer.MIN_VALUE;
        while(frontIndex<tailIndex){
            int area = (tailIndex-frontIndex) * Math.min(height[frontIndex],height[tailIndex]);
            if(area>maxArea){
                maxArea = area;
            }
            if(height[frontIndex]>height[tailIndex]){
                tailIndex--;
            }else{
                frontIndex++;
            }
        }
        return maxArea;
    }
}
// @lc code=end


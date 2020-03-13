/*
 * @lc app=leetcode id=739 lang=java
 *
 * [739] Daily Temperatures
 */

// @lc code=start
class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] ret = new int[T.length];
        for(int i = 0; i < T.length; i++){
            for(int j = i+1; j < T.length; j++){
                if(T[j]>T[i]){
                    ret[i] = (j-i);
                    break;
                }else if(T[j]<T[i]){
                    ret[i] = 0;
                }
            }
        }
        return ret;
    }
}
// @lc code=end


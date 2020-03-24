import java.util.*;
/*
 * @lc app=leetcode id=384 lang=java
 *
 * [384] Shuffle an Array
 */

// @lc code=start
class Solution {
    int[] origin;
    public Solution(int[] nums) {
        this.origin = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.origin;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        List<Integer> ls = new ArrayList<>();
        for(int num : origin){
            ls.add(num);
        } 

        Random rand = new Random();
        int[] rs = new int[origin.length];
        for(int i = 0; i < origin.length; i++){
            rs[i] = ls.get(rand.nextInt(ls.size()));
            ls.remove((Object)rs[i]);
        }
        return rs;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
// @lc code=end


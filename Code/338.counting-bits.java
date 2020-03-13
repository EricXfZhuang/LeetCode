/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 */

// @lc code=start
class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        for(int i = 0; i <= num; i++){
            //binary representation
            String binary = Integer.toBinaryString(i);
            int numOnes = countOnes(binary);
            res[i] = numOnes;
        }
        return res;
    }

    public int countOnes(String binary){
        int res = 0;
        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i)=='1') res++;
        }
        return res;
    }
}
// @lc code=end


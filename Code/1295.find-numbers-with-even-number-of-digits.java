/*
 * @lc app=leetcode id=1295 lang=java
 *
 * [1295] Find Numbers with Even Number of Digits
 */

// @lc code=start
class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for(Integer num : nums){
            if(contEvenDigits(num)){
                result++;
            }
        }
        return result;
    }

    public boolean contEvenDigits(int num){
        int count = 0;
        while(num > 0){
            num /= 10;
            count++;
        }
        return count%2==0;
    }
}
// @lc code=end


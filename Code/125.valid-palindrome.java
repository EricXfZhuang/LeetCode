/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        String letterString = s.replaceAll("[\\W]", "");
        String reverseString = new StringBuffer(letterString).reverse().toString();
        if(letterString.compareToIgnoreCase(reverseString)==0)
            return true;
        else
            return false; 
    }
}
// @lc code=end


/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1) return s;
        int maxLen = 0;
        String res = "";
        String newS = "";
        for(int i = 0; i < s.length(); i++){
            newS = newS + "#" + s.charAt(i);
        }
        for(int i = 0; i < newS.length(); i++){
            String str = isPalindrome(newS, i);
            System.out.println(str);
            if(str.length() >= maxLen){
                maxLen = str.length();
                res = str;
            }
        }
        String rs = "";
        for(int i = 0; i < res.length(); i++){
            if(res.charAt(i)!='#'){
                rs += res.charAt(i);
            }
        }
        return rs;
    }

    /**
     * check from the middle 
     */
    public String isPalindrome(String s, int mid){
        int left = mid-1, right = mid +1;
        while(left>=0 && right < s.length()){
            if(s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }else{
                break;
            }
        }
        return s.substring(left+1, right);
    }
}
// @lc code=end


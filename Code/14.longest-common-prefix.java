/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 *
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (34.63%)
 * Likes:    1988
 * Dislikes: 1654
 * Total Accepted:    634.5K
 * Total Submissions: 1.8M
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * Write a function to find the longest common prefix string amongst an array
 * of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * 
 * 
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 * 
 * Note:
 * 
 * All given inputs are in lowercase letters a-z.
 * 
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min_len = Integer.MAX_VALUE;

        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }

        //calculate min_len
        for(String str : strs){
            if(str.length() < min_len){
                min_len = str.length();
            }
        }

        String res = "";
        //scan from index 0 to index max_len - 1
        for(int i = 0;i < min_len;i++){
            char common_element = strs[0].charAt(i);
            //check if it's the common element
            for(int j = 1;j < strs.length;j++){
                if(common_element != strs[j].charAt(i)){
                    return res;
                }
            }
            res += Character.toString(common_element);
        }
        return res;

        
    }
}
// @lc code=end


import java.util.*;
/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        Map<String, Integer> map = new HashMap();
        for(String c : s.split("")){
            if(map.get(c)==null){
                map.put(c, 1);
            }else{
                map.put(c, map.get(c)+1);
            }
        }
        int count1 = 0;//for # of apperance is even 
        int count2 = 0;//for odd
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue()%2==0)
                count1 += entry.getValue();
            else{
                count1 += entry.getValue()-1;
                count2++;
            }
        }
        if(count2>0){
            return count1+1;
        }else{
            return count1;
        }

    }
}
// @lc code=end


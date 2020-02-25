import java.util.*;
/*
 * @lc app=leetcode id=93 lang=java
 *
 * [93] Restore IP Addresses
 */

// @lc code=start
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        backTracking(s, res, "", 0, 0);
        return res;
    }

    public boolean isValid(String str){
        if(str.equals("0"))
            return true;
        if(((Character)str.charAt(0)).equals('0'))
            return false;
        return true;
    }
    
    public void backTracking(String s, List<String> res, String leaf, int level, int start){
        if(level==4) {
            // System.out.println(leaf);
            // System.out.println(leaf.length());
            if(start == s.length()){
                leaf = leaf.substring(0, leaf.length()-1);
                String[] strArr = leaf.split("\\.");
                for(String str : strArr){
                    if(Integer.parseInt(str)>255 || !isValid(str)) 
                        return;
                }
                res.add(leaf);
            }
            return;
        }else{
            for(int i = 0;i<3;i++){

                if(start+i+1 <= s.length())
                    backTracking(s, res, leaf + s.substring(start, start+i+1) + ".", level+1, start+i+1);
            }
        }
         
    }

}
// @lc code=end


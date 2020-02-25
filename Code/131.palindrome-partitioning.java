import java.util.*;
/*
 * @lc app=leetcode id=131 lang=java
 *
 * [131] Palindrome Partitioning
 */

// @lc code=start
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new LinkedList<>();
        dfs(s, res, new LinkedList<String>(), 0);
        return res;
    }

    public void dfs(String s, List<List<String>> res, List<String> leaf, int start){
        if(start==s.length()){
            res.add(leaf);
            return;
        }else{
            for(int i = start;i<s.length();i++){
                List<String> newLeaf = (List<String>) ((LinkedList<String>)leaf).clone();
                if(isPalindrome(s.substring(start, i+1))){
                    newLeaf.add(s.substring(start, i+1));
                    dfs(s, res, newLeaf, i+1);
                }
            }
        }
    }

    public boolean isPalindrome(String str){
        if(str.length()==0) return true;
        for(int i = 0;i<str.length()/2;i++){
            if(!((Character)str.charAt(i)).equals(str.charAt(str.length()-1-i))){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end


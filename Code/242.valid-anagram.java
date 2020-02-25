import java.util.*;
/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        //method1 同时删除s.charAt(0), 如果删到最后为空就是true, 否则就是false
        //runtime beatss 44.1%
        if(s.length()==0 && t.length()==0) return true;
        if(s.length()!=t.length()){
            return false;
        }else{
             return isAnagram(s.replace(Character.toString(s.charAt(0)), ""), t.replace(Character.toString(s.charAt(0)),""));
        }

        //method 2, 使用HashMap 
        //runtime beats 20.43%
        // Map<Character, Integer> map = new HashMap<Character, Integer>();
        // for(int i = 0;i<s.length();i++){
        //     if(map.containsKey(s.charAt(i))){
        //         map.put(s.charAt(i), map.get(s.charAt(i))+1);
        //     }else{
        //         map.put(s.charAt(i), 1);
        //     }
        // }

        // for(int i = 0;i<t.length();i++){
        //     if(!map.containsKey(t.charAt(i))){
        //         return false;
        //     }else{
        //         int count = map.get(t.charAt(i))-1;
        //         if(count==0){
        //             map.remove(t.charAt(i));
        //         }else{
        //             map.put(t.charAt(i), count);
        //         }
        //     }
        // }
        // return map.isEmpty();
    }
}
// @lc code=end


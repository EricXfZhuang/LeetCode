import java.util.HashMap;

/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if(len1 != len2) return false;
        HashMap<Character,Character> map1 = new HashMap<Character, Character>(); 
        HashMap<Character,Character> map2 = new HashMap<Character, Character>();
        for(int i = 0;i<len1;i++){
            map1.putIfAbsent(s.charAt(i), t.charAt(i));
            map2.putIfAbsent(t.charAt(i), s.charAt(i));
            if(t.charAt(i)!=map1.get(s.charAt(i))) return false;
            if(s.charAt(i)!=map2.get(t.charAt(i))) return false;
        }
        return true;
    }
}
// @lc code=end


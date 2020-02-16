import java.util.*;

/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        String[] strArr = magazine.split("");

        for(String str : strArr){
            //traverse magazine
            ransomNote = ransomNote.replaceFirst(str, "");
            if(ransomNote.isBlank()) return true;
        }
        return false;
    }   
}
// @lc code=end


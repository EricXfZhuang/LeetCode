package Code;

import java.util.*;

/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        if(s.isBlank()) return -1;
        //Map<String, Boolean> isUnique = new LinkedHashMap<String, Boolean>();
        //String[] strArr = s.split("");
        for(int i = 0;i < s.length();i++){
            String str = Character.toString(s.charAt(i));
            if(s.replaceFirst(str, "").indexOf(str) == -1)
                return s.indexOf(str);
        }
        return -1;
        // for(String str : strArr){
        //     if(isUnique.containsKey(str))
        //         isUnique.put(str, false);
        //     else
        //         isUnique.put(str, true);
        // } 

        // //System.out.println(isUnique.toString());
        // for(Map.Entry<String, Boolean> entry : isUnique.entrySet()){
        //     if(entry.getValue())
        //         return s.indexOf(entry.getKey());
        // }
        // return -1;
    }
}
// @lc code=end


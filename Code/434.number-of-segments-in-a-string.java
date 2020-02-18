import java.util.Arrays;

/*
 * @lc app=leetcode id=434 lang=java
 *
 * [434] Number of Segments in a String
 */

// @lc code=start
class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if(s.equals("")) return 0;
        String[] arr = s.split(" ");
        int count = 0;
        for(String str : arr){
            if(!str.isBlank())
                count++;
        }
        return count;
    }
}
// @lc code=end


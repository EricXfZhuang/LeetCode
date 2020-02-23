import java.util.Arrays;

/*
 * @lc app=leetcode id=455 lang=java
 *
 * [455] Assign Cookies
 */

// @lc code=start
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int index1 = 0;
        int index2 = 0;
        int rs = 0;
        while(index1<g.length && index2<s.length){
            int gi = g[index1];
            int sj = s[index2];
            if(sj>=gi){
                rs++;
                index2++;
                index1++;
            }else{
                index2++;
            }
        }
        return rs;
    }
}
// @lc code=end


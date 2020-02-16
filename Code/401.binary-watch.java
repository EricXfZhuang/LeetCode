import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=401 lang=java
 *
 * [401] Binary Watch
 */

// @lc code=start
class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> ret = new ArrayList();
        for(int h = 0;h < 12;h++){
            for(int m = 0;m < 60;m++){
                if(Integer.bitCount(h)+Integer.bitCount(m)==num)
                    ret.add(String.format("%d:%02d", h, m));
            }
        }
        return ret;
    }

   

    
}
// @lc code=end


import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ret = new LinkedList<String>();
        for(int i = 0;i < n;i++){
            if((i+1)%5==0 && (i+1)%3==0){
                ret.add("FizzBuzz");
                continue;
            }
            if((i+1)%3==0){
                ret.add("Fizz");
                continue;
            }
            if((i+1)%5==0){
                ret.add("Buzz");
                continue;
            }
            ret.add(Integer.toString(i+1));
        }
        return ret;
    }
}
// @lc code=end


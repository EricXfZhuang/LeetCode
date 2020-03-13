import java.util.*;
import java.util.Collections;
/*
 * @lc app=leetcode id=621 lang=java
 *
 * [621] Task Scheduler
 */

// @lc code=start
class Solution {
    int[] charArr = new int[26];
    public int leastInterval(char[] tasks, int n) {
        for(char c : tasks){
            charArr[c-'A']++;
        }

        Arrays.sort(charArr);
        int index = 25;
        int res = 0;
        boolean flag = false;
        int numIdle = 0;
        while(true){
            index = 25;
            if(charArr[index]<=0){
                if(flag){
                    res = res - numIdle;
                }
                break;
            }
            flag = false;
            numIdle = 0;
            for(int i = 0; i <= n; i++){
                if(charArr[index]>0){
                    charArr[index--]--;
                }else{
                    numIdle++;
                    flag = true;
                }
                res++;
            }
            Arrays.sort(charArr);
        }
        return res;
    }

}
// @lc code=end


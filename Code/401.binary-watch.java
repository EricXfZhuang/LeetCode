import java.util.*;

/*
 * @lc app=leetcode id=401 lang=java
 *
 * [401] Binary Watch
 */

// @lc code=start
class Solution {
    List<String> res = new ArrayList<>();
    List<Integer> numLs = new ArrayList<>();
    Map<Integer, Integer> minMap = Map.of(0, 60, 1, 120, 2, 240, 3, 480, 4, 1, 5, 2, 6, 4, 7, 8, 8, 16, 9, 32);
    public List<String> readBinaryWatch(int num) {
        dfs(num, 0, 0);
        Collections.sort(numLs);
        for(Integer time : numLs){
            String str = convertTime(time);
            if(str!=""){
                res.add(str);
            }
        }
        return res;
    }

    public void dfs(int num, Integer sumMins, int  prev){
        if(num==0){
            numLs.add(sumMins);
            return;
        }else{
            for(int i = prev;i<10;i++){
                dfs(num-1, sumMins+minMap.get(i), i+1);
            }
        }
    }

    public String convertTime(Integer sumMins){
        int hours = sumMins/60;
        int mins = sumMins - hours*60;
        if(hours>11) return "";
        if(mins>59) return "";
        String minStr = Integer.toString(mins);
        if(mins<10)
            minStr = "0" + minStr;
        return Integer.toString(hours) + ":" + minStr;
    }

   

    
}
// @lc code=end


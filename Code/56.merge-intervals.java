import  java.util.*;
/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        // brute force
        /***
         * sort by interval[0], and then sort by interval[1]
         */
        for(int i = 0; i < intervals.length; i++){
            boolean flag = false;
            for(int j = 0; j < intervals.length-1-i; j++){
                if(intervals[j][0] > intervals[j+1][0] || (intervals[j][0]==intervals[j+1][0] && intervals[j][1] > intervals[j+1][1])){
                    int[] temp = intervals[j];
                    intervals[j] = intervals[j+1];
                    intervals[j+1] = temp;
                    flag = true;
                }
            }
            if(flag==false) break;
        }

        for(int[] interval : intervals){
            System.out.println(Arrays.toString(interval));
        }

        //merge
        List<int[]> ls = new ArrayList<>();
        for(int[] interval : intervals){
            ls.add(interval);
        }
        while(true){
            boolean flag = false;
            int index = 0;
            while(index < ls.size()-1){
                if(ls.get(index)[1] >= ls.get(index+1)[0] && ls.get(index)[1] <= ls.get(index+1)[1]){
                    flag = true;
                    ls.get(index)[1] = ls.get(index+1)[1];
                    ls.remove(index+1);
                }else if(ls.get(index)[1] > ls.get(index+1)[1]){
                    flag = true;
                    ls.remove(index+1);
                }
                else{
                    index++;
                }
            }
            if(flag == false) break;
        }

        int[][] rs = new int[ls.size()][2];
        int index = 0;
        for(int[] interval : ls){
            rs[index++] = interval;
        }
        return rs;
    }
}
// @lc code=end


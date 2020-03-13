import java.util.*;
/*
 * @lc app=leetcode id=406 lang=java
 *
 * [406] Queue Reconstruction by Height
 */

// @lc code=start
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        List<int[]> ls = new ArrayList<>();
        int[][] rs = new int[people.length][2];
        Arrays.sort(people, new peopleComparator());
        for(int i = 0; i < people.length; i++){
            insert(ls, people[i]);
        }
        for(int i = 0; i < ls.size(); i++){
            rs[i] = ls.get(i);
        }
        return rs;
    }

    class peopleComparator implements Comparator<int[]>{
        @Override
        public int compare(int[] arg0, int[] arg1) {
            // TODO Auto-generated method stub
            if(arg0[1] < arg1[1])
                return -1;
            else
                return 1;
        }
    }

    public void insert(List<int[]> ls, int[] people) {
        if (ls.isEmpty()){
            ls.add(people);
            return;
        }
        int count = 0;
        for(int i = 0; i < ls.size(); i++){
            if( ls.get(i)[0] >= people[0]){
                count++;
            }
            if(count > people[1]){
                if(i>0){
                    ls.add(i, people);
                }else{
                    ls.add(0, people);
                }
                return;
            }
        }
        ls.add(people);
        return;
    }
}
// @lc code=end


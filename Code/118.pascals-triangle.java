import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        //initialize
        List<List<Integer>> ret = new ArrayList<>();
        for(int i = 0;i < numRows;i++){
            List<Integer> row = new LinkedList<Integer>();
            if(i<2){
                for(int j = 0;j < i+1;j++){
                    row.add(1);
                }
            }
            else{
                for(int j = 0;j < i+1;j++){
                    if(j == 0 | j == i)
                        row.add(1);
                    else{
                        row.add(ret.get(i-1).get(j-1) + ret.get(i-1).get(j));
                    }
                }
            }
            ret.add(row);
        }
        return ret;
    }
}
// @lc code=end


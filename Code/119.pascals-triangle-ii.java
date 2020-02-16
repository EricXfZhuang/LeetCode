import java.util.ArrayList;
import java.util.LinkedList;

/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0;i <= 1;i++){
            arr.add(1);
            if(rowIndex==0) return arr;
        }
        if(rowIndex<=1) return arr;
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(int i = 2;i <= rowIndex;i++){
            for(int j = 0;j <= i;j++){
                if(j==0 | j==i)
                    arr2.add(1);
                else{
                    arr2.add(arr.get(j-1)+arr.get(j));
                }
            }
            arr = (ArrayList<Integer>) arr2.clone();
            arr2.clear();
        }
        return arr;

    }
}
// @lc code=end


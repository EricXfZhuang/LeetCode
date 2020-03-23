import java.util.*;

/*
 * @lc app=leetcode id=526 lang=java
 *
 * [526] Beautiful Arrangement
 */

// @lc code=start
class Solution {
    int rs = 0;
    public int countArrangement(int N) {
        List<Integer> nums = new ArrayList<>();
        for(int i = 1; i <= N; i++){
            nums.add(i);
        }
        for(int i = 1; i <= N; i++){
            nums.remove(i-1);
            dfs(i, 1, nums);
            nums.add(i-1, i);
        }
        return rs;
    }

    public void dfs(int num, int pos, List<Integer> nums){
        if(!(num % pos == 0 || pos % num == 0)) return;
        if(nums.isEmpty()){
            rs++;
        }
        for(int i = 0; i < nums.size(); i++){
            int nextNum = nums.get(i);
            nums.remove(i);
            dfs(nextNum, pos+1, nums);
            nums.add(i, nextNum);
        }
    }
}
// @lc code=end


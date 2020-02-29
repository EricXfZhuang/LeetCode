import java.util.*;
/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        /**
         * P[3] = 3C1 * 2C1 * 1C1
         *      = [1,2,3] * [1,2]/[1,3]/[2,3] * [1]/[2]/[3]
         */
        List<List<Integer>> res = new LinkedList<>();
        Integer[] perm = new Integer[nums.length];
        boolean[] visited = new boolean[nums.length];
        System.out.println(Arrays.toString(visited));
        dfs(nums, res, perm, 0, visited);
        return res;
    }

    public void dfs(int[] nums, List<List<Integer>> res, Integer[] arr, int start, boolean[] visited){
        if(start==arr.length){
            res.add(Arrays.asList(arr));
        }else{
            for(int i = 0;i<nums.length;i++){
                Integer[] newArr = arr.clone();
                if(!visited[i]){
                    boolean[] newVisited = visited.clone();
                    newArr[start] = nums[i];
                    newVisited[i] = true;
                    dfs(nums, res, newArr, start+1, newVisited);
                }
            }
        }
    }
}
// @lc code=end


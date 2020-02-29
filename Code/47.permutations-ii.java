import java.util.*;
/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Integer[] perm = new Integer[nums.length];
        boolean[] visited = new boolean[nums.length];
        System.out.println(Arrays.toString(visited));
        dfs(nums, res, perm, 0, visited);
        Set set = new HashSet(res);
        System.out.println(set.toString());
        Iterator iter = set.iterator();
        res.clear();
        while(iter.hasNext()){
            res.add((List<Integer>) iter.next());
        }
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


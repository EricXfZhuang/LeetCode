import java.util.*;
/*
 * @lc app=leetcode id=207 lang=java
 *
 * [207] Course Schedule
 */

// @lc code=start
class Solution {
    private class Graph{
        int V;
        List<Integer>[] adj;

        public Graph(int v){
            this.V = v;
            this.adj = new LinkedList[v];
            for(int i = 0; i < v; i++){
                adj[i] = new LinkedList<Integer>();
            }
        }

        public void addEdge(int from, int to){
            adj[from].add(to);
        }

        @Override
        public String toString(){
            String res = "";
            for(int i = 0; i < V; i++){
                res += i + "->";
                res += adj[i].toString();
            }
            return res;
        }
    }

    public boolean dfs(Graph G, int v, int[] visited){
        // System.out.println("v:"+v);
        if(visited[v]==1) return true;
        if(visited[v]==2) return false;
        visited[v] = 1;
        List<Integer> leaves = G.adj[v];
        for(int leaf : leaves){
            if(dfs(G, leaf, visited)){
                // System.out.println("leaf:"+leaf);
                return true;
            }
        }
        visited[v] = 2;
        return false;
    }

    
    public boolean canFinish(int numCourses, int[][] prerequisites) { 
        Graph G = new Graph(numCourses);
        for(int[] path : prerequisites){
            for(int i = 1; i < path.length; i++){
                G.addEdge(path[i-1], path[i]);
            }
        }

        // System.out.println(G.toString());
        int[] visited = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            if(dfs(G, i, visited)){
                return false;
            }

        }

       return true;
    }
}
// @lc code=end


import java.util.*;
/*
 * @lc app=leetcode id=721 lang=java
 *
 * [721] Accounts Merge
 */

// @lc code=start
class Solution {
        public List<List<String>> accountsMerge(List<List<String>> accounts) {
            Map<String, Integer> map = new HashMap<String, Integer>();
            Unionfind uf = new Unionfind(accounts.size());
            for(int i = 0; i < accounts.size(); i++){
                /**
                 * 1. map[email] <- root root = {0,1,2,3} if accounts.size() == 4
                 * 2. if(isContain(email)) union two root
                 */
                for(int j = 1; j < accounts.get(i).size(); j++){
                    String email = accounts.get(i).get(j);
                    if(map.containsKey(email)){
                        uf.union(map.get(email), i);
                    }
                    map.put(email, i);
                }
            }

            List<List<String>> res = new ArrayList<>();
            Map<Integer, List<String>> forest = new HashMap<>();
            for(int i = 0; i < accounts.size(); i++){
                int findI = uf.find(i);
                Set<String> set = new HashSet<>(accounts.get(i));
                if(findI!=i){
                    set.addAll(accounts.get(findI));
                }
                List<String> ls = new ArrayList<>();
                if(!forest.containsKey(findI)){
                    ls.addAll(set);
                    forest.put(findI, ls);
                }else{
                    set.addAll(forest.get(findI));
                    ls.addAll(set);
                    forest.put(findI, ls);
                }
            }

            for(Map.Entry<Integer, List<String>> entry : forest.entrySet()){
                List<String> ls = entry.getValue();
                Collections.sort(ls);
                res.add(ls);
            }
            return res;
        }

        private class Unionfind{
            private int[] roots;
            private int numRoot;

            public Unionfind(int n){
                this.numRoot = n;
                roots = new int[n];
                for(int i = 0; i < n; i++){
                    roots[i] = i;
                }
            }

            public int find(int q){
                return roots[q];
            }

            public void union(int q, int p){
                int pRoot = roots[q];
                int qRoot = roots[p];
                
                if(pRoot==qRoot) return;
                
                for(int i = 0; i < roots.length; i++){
                    if(roots[i]==pRoot) roots[i] = qRoot;
                }
                numRoot--;
            }
        }
        
        
}
// @lc code=end


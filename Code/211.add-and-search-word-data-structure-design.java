import java.util.*;
/*
 * @lc app=leetcode id=211 lang=java
 *
 * [211] Add and Search Word - Data structure design
 */

// @lc code=start
class WordDictionary {

    /** Initialize your data structure here. */
    private class TrieNode{
        boolean isEndofWord;
        TrieNode[] children;

        public TrieNode(){
            this.isEndofWord = false;
            this.children = new TrieNode[26];
        }

        public TrieNode leafAt(int i){
            return children[i];
        }
    }

    TrieNode root;

    public WordDictionary() {
        this.root = new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode node = this.root;
        for(int i = 0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(node.leafAt(index) == null){
                node.children[index] = new TrieNode();
                node = node.children[index];
            }else{
                node = node.leafAt(index);
            }
        }
        node.isEndofWord = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return backTrack(word.toCharArray(), 0, this.root);
    }

    public boolean backTrack(char[] word, int curr, TrieNode node){
        // base case
        if(curr == word.length){
            if(node.isEndofWord)
                return true;
            else
                return false;
        }

        int index = word[curr] - 'a';
        if(index >= 0){
            if(node.leafAt(index) == null) return false;
            else{
                return backTrack(word, curr+1, node.leafAt(index));
            }
        }else{
            for(int i = 0; i < 26; i++){
                if(node.leafAt(i) != null){
                    if(backTrack(word, curr+1, node.leafAt(i))) return true;
                }
            } 
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
// @lc code=end


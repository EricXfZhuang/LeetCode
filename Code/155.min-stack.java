import java.util.*;
/*
 * @lc app=leetcode id=155 lang=java
 *
 * [155] Min Stack
 */

// @lc code=start
class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> stack;
    Stack<Integer> minS;
    public MinStack() {
        stack = new Stack<Integer>();
        minS = new Stack<Integer>();
    }
    
    public void push(int x) {
        stack.push(x);
        if(minS.isEmpty()){
            minS.push(x);
        }else{
            if(x<=minS.peek()){
                minS.push(x);
            }
        }
    }
    
    public void pop() {
        int ele = stack.peek();
        stack.pop();
        if(ele==minS.peek()) minS.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minS.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end


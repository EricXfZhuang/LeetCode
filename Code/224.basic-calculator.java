import java.util.*;
/*
 * @lc app=leetcode id=224 lang=java
 *
 * [224] Basic Calculator
 */

// @lc code=start
class Solution {

    private static Stack<Integer> numberS;
    private static Stack<Character> operatorS;

    public int calculate(String s) {
        s = s.trim();
        int res = 0;
        int index = 0;
        numberS = new Stack<Integer>();
        operatorS = new Stack<Character>();
        while(index<s.length()){
            String numStr="";
            while(Character.isDigit(s.charAt(index))){
                numStr = numStr + s.charAt(index);
                index++;
            }
            if(!numStr.isBlank()){
                numberS.push(Integer.parseInt(numStr));
                continue;
            }
            if(isPlus(s.charAt(index))
               | isMinus(s.charAt(index))
               | isLeftBracket(s.charAt(index))
               | isRightBracket(s.charAt(index)) ){
                   operatorS.push(s.charAt(index));
            }
            index++;
        }
        
        boolean isOpen = false; int valOfExpr = 0;
        while(!numberS.isEmpty() || !operatorS.isEmpty()){
            Character operator = operatorS.pop();
            if(isLeftBracket(operator)){
                isOpen = true;
                continue;
            }
            if(isRightBracket(operator)){
                isOpen = false;
                numberS.push(valOfExpr);
                continue;
            }
            if(isPlus(operator)){
                if(isOpen){
                    if(isPlus(operatorS.peek()) | isMinus(operatorS.peek())){
                        
                    }
                }
            }

        }
    }

    public boolean isPlus(Character c){
        return c.equals('+');
    }

    public boolean isMinus(Character c){
        return c.equals('-');
    }

    public boolean isRightBracket(Character c){
        return c.equals(")");
    }

    public boolean isLeftBracket(Character c){
        return c.equals("(");
    }

}
// @lc code=end


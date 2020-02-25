/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        // String letterString = s.replaceAll("[\\W]", "");
        // String reverseString = new StringBuffer(letterString).reverse().toString();
        // if(letterString.compareToIgnoreCase(reverseString)==0)
        //     return true;
        // else
        //     return false; 

        //front and tail pointer method
        int front = 0;
        int tail = s.length()-1;
        s = s.toLowerCase();
        while(front<tail){
            char frontChar = s.charAt(front);
            char tailChar = s.charAt(tail);
            if(Character.isLetterOrDigit(frontChar) && Character.isLetterOrDigit(tailChar)){
                if(frontChar!=tailChar){
                    return false;
                }else{
                    front++;
                    tail--;
                }
            }else if(!Character.isLetterOrDigit(frontChar) && Character.isLetterOrDigit(tailChar)){
                front++;
            }else if(Character.isLetterOrDigit(frontChar) && !Character.isLetterOrDigit(tailChar)){
                tail--;
            }else{
                front++;
                tail--;
            }
        }
        return true;
    }
}
// @lc code=end


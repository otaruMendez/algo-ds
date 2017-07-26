import java.util.Stack;

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> stack = new Stack();
        String sequence = S;
        
        char[] charArray = sequence.toCharArray();
        
        for (char s : charArray){
            if (s == '[' || s == '{' || s == '('){
                stack.push(s);
            }else{
                if (stack.isEmpty()){
                    return 0;
                }
                char p = stack.pop();
                if (!((p == '{' && s == '}') || (p == '[' && s == ']') || (p == '(' && s == ')'))){
                    return 0;
                }
            }
        }
        if (!stack.isEmpty()){
            return 0;
        }
        return 1;
    }        
}

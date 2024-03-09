import java.util.Stack;

public class ValidParentheses {
    boolean execute(String s){
        int len = s.length();
        if(len%2 != 0)return false;
        Stack<Character> charStack = new Stack<>();
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(isOpen(ch)){
                charStack.push(ch);
            }else if(isClose(ch) && !charStack.isEmpty() && isParenthesesPair(charStack.peek(),ch)){
                charStack.pop();
            }else {
                return false;
            }
        }
        return charStack.isEmpty();
    }

    boolean isOpen(char c){
        return c == '(' || c == '{' || c == '[';
    }

    boolean isClose(char c){
        return c == ')' || c == '}' || c == ']';
    }

    boolean isParenthesesPair(char ch1, char ch2){
        return ((ch1 == '{' && ch2 == '}')||(ch1 == '[' && ch2 == ']')|| (ch1 == '(' && ch2 == ')'));
    }
}

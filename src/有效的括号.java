import java.util.Stack;

public class 有效的括号 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(int i = 0; i < s.length(); i++){
            if(!stack.empty()){
                char peek = stack.peek();
                if(s.charAt(i) == ')' && peek == '(') stack.pop();
                else if(s.charAt(i) == ']' && peek == '[') stack.pop();
                else if(s.charAt(i) == '}' && peek == '{') stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }
}

import java.util.Stack;

public class 判断括号是否合法 {
    public static void main(String[] args) {
        System.out.println(isValidate("dafd(fa)sd(fa)sf"));
        System.out.println(isValidate("dafd(fasd(fasf"));
        System.out.println(isValidate("dafd(fasd)fasf"));
        System.out.println(isValidate("dafd((fasd)fasf"));
        System.out.println(isValidate("dafd(fasd))fasf"));
        System.out.println(isValidate("dafd)(fasd)(fasf"));
    }


    static boolean isValidate(String str) {

        Stack<Character> stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') stack.push(str.charAt(i));
            else if ( str.charAt(i) == ')'){
                if (stack.isEmpty()) {
                    return false;
                }else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}

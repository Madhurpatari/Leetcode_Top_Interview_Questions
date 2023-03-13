import java.util.Stack;

public class LC20_validParenthesis {
    public static boolean is_valid(String s){
        if(s.length() %2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c =='{' || c == '['){
                stack.push(c);
            }
            else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }
            else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }
            else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "{}[]()";
        boolean ans = is_valid(s);
        System.out.println(ans);
    }
}

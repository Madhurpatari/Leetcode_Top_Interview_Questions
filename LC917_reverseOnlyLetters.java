import java.util.Stack;

public class LC917_reverseOnlyLetters{
    public static String reverseOnlyLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                stack.push(ch);
            }
        }

        final StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                sb.append(stack.pop());//dc-
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="ab-cd";
        System.out.println(reverseOnlyLetters(s));
    }
}
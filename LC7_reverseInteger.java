public class LC7_reverseInteger {
    public static int reverse(int x){
        long reversed_num = 0;
        while(x!=0){
            int popped_digit = x%10;
            reversed_num = reversed_num*10+popped_digit;
            x /= 10;
            if(reversed_num <Integer.MIN_VALUE || reversed_num > Integer.MAX_VALUE){
                return 0;
            }
            
        }    
        return (int) reversed_num;
    }
    public static void main(String[] args) {
        int x =-321;
        System.err.println(
            reverse(x));
    }
}

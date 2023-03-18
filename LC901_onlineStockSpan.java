import java.util.Stack;

class Pair{
    int val, index;
    Pair(int index, int val){
        this.index = index;
        this.val = val;
    }
}
class StockSpanner{
    Stack<Pair> stack = new Stack<>();
    int idx =0;
    public int next(int price){
        while(!stack.isEmpty() && stack.peek().val <= price){
            stack.pop();
        }
        int span = (!stack.isEmpty()) ? idx -stack.peek().index :idx +1;
        stack.push(new Pair(idx, price));
        idx++;
        return span;
    }
}
public class LC901_onlineStockSpan{
    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        System.out.println( stockSpanner.next(100));
        System.out.println( stockSpanner.next(80));
        System.out.println( stockSpanner.next(60));
        System.out.println( stockSpanner.next(70));
        System.out.println( stockSpanner.next(60));
        System.out.println( stockSpanner.next(75));
    }
}
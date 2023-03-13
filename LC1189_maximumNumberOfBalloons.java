public class LC1189_maximumNumberOfBalloons{
    public static int maxNumberOfBalloons(String text){
        int b =0, a=0, l=0, o=0, n=0, max=0;
        for(char c : text.toCharArray()){
            switch (c) {
                case 'b' -> b++;
                case 'a' -> a++;
                case 'l' -> l++;
                case 'o' -> o++;
                case 'n' -> n++;    
            }
            if(b>=1 && a>=1 && l>=2 && o>=2 && n>=1){
                max++;
                b -= 1; 
                a -= 1;
                l -= 2;
                o -= 2;
                n -= 1;

            }
        }
        return max;
    }
    public static void main(String[] args) {
        String text = "nlaebolko";
        System.out.println(maxNumberOfBalloons(text));
    }
}
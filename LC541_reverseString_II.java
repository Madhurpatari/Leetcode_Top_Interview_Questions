public class LC541_reverseString_II {
    public static String reverseStr(String s, int k) {
        char ch[] = s.toCharArray();
        for (int i = 0; i < s.length(); i+=2*k) {
            int l =i;
            int r = Math.min(i+k-1, s.length()-1);
            while(l<r){
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String str = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(str, k));
    }
}

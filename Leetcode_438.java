import java.util.ArrayList;
public class Leetcode_438 {
    public static ArrayList<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> result  = new ArrayList<>();
        
        int char_counts[] = new int[26];
        for(char c : p.toCharArray()){
            char_counts[c-'a']++;
        }
        
        int left =0;
        int right =0;
        int count = p.length();
        while(right < s.length()){
            if(char_counts[s.charAt(right++)-'a']-- >= 1){
                count--;
            }
            if(count==0){
                result.add(left);
            }
            if(right -left ==p.length() && char_counts[s.charAt(left++)-'a']++>=0){
                count++;
            }
        }
        return result;

    }
    

    public static void main(String[] args) {
        String  s = "cbaebabacd";
        String p = "abc";

        ArrayList<Integer> ans = findAnagrams(s, p);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}

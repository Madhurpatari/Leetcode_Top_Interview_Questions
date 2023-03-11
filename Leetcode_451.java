import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*451. Sort Characters By Frequency
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them. */
public class Leetcode_451{
    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        ArrayList<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b)->{
            if(map.get(a)==map.get(b)){
                return a.compareTo(b);
            }else{
                return map.get(b)-map.get(a);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(char ch : list){
            for (int i = 0; i <map.get(ch); i++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));

    }
}
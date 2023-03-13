import java.util.HashMap;
public class LC205_IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t){
        String res = "";
        HashMap<Character,Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char s_ch = s.charAt(i);
            char t_ch = t.charAt(i);
            if(!map.containsKey(s_ch)  && !map.containsValue(t_ch)){
                map.put(s_ch, t_ch);
            }
            res += map.get(s_ch);
        }
        return res.equals(t);
    }
    public static void main(String[] args) {
        String s ="foo";
        String t = "bar";
        System.out.println(isIsomorphic(s, t));
    }
}
/*205. Isomorphic Strings
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true

Constraints:
1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character. */
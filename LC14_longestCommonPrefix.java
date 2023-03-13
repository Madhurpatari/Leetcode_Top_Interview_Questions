import java.util.Arrays;

public class LC14_longestCommonPrefix {
    public static String longestCommonPrefix(String[] s){
        int n = s.length;
        Arrays.sort(s);
        String str1 = s[0];
        String str2 =s[n-1];
        int idx =0;
        while(idx < str1.length()){
            if(str1.charAt(idx)==str2.charAt(idx)){
                idx++;
            }else{
                break;
            }
        }
        return str1.substring(0,idx);
    }
    public static void main(String[] args) {
        String strs[] = {"flower", "flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
/*14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters. */

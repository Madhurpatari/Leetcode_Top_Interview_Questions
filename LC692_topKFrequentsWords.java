import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/*692. Top K Frequent Words
Given an array of strings words and an integer k, return the k most frequent strings.
Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.
*/
public class LC692_topKFrequentsWords{
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : words){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b)->a.getValue()==b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue()-a.getValue() );
        
        for(Map.Entry<String,Integer> smap : map.entrySet()){
            pq.add(smap);
        }

        ArrayList<String> list = new ArrayList<>();
        while(k-->0){
            Map.Entry<String, Integer> smap = pq.poll();
            list.add(smap.getKey());
        }
        return list;
    }
    public static void main(String[] args) {
        String words[] = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        ArrayList<String> ans = (ArrayList<String>) topKFrequent(words, k);

        for (String e : ans) {
            System.out.print(e+" ");
        }

    }
}
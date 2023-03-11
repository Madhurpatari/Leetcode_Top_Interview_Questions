import java.util.HashMap;
@SuppressWarnings("all")
// 128. Longest Consecutive Sequence
// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
// You must write an algorithm that runs in O(n) time.
public class Leetcode_128{
    public static int longestConsecutive(int[] nums){
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int num : nums){
            map.put(num, false);
        }
        int longest_sequence =0;
        for(int num : nums){
            int current_length =1;
            //check in forward direction
            int next_num = num +1;
            while(map.containsKey(next_num) && map.get(next_num)==false){
                current_length++;
                map.put(next_num, true);
                next_num++;
            }

            //check in backward direction
            int previous_num = num-1;
            while(map.containsKey(previous_num) && map.get(previous_num)==false){
                current_length++;
                map.put(previous_num, true);
                previous_num--;
            }
            longest_sequence = Math.max(longest_sequence, current_length);
        }
        return longest_sequence;
    }
    public static void main(String[] args) {
        // Input: nums = [100,4,200,1,3,2]
        // Output: 4
        // Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
        int nums[] ={100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));

    }
}
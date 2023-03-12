import java.util.HashMap;

/*
560. Subarray Sum Equals K
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.
 */
public class Leetcode_560 {

    public static int subarray(int nums[], int k){
        int result =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(map.containsKey(sum-k)){
                result += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] ={1,1,1};
        int k = 2;
        System.out.println(subarray(nums, k));
    }
}

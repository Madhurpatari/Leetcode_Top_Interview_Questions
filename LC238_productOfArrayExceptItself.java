
/*
238. Product of Array Except Self
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
 */
public class LC238_productOfArrayExceptItself {
    public static int[] productExceptSelf(int nums[]){
        int n = nums.length;
        int left_products[] = new int[nums.length];
        int right_products[] = new int[nums.length];
        left_products[0] =1;
        right_products[n-1] = 1;

        int output_array[] = new int[n];

        //left products
        for(int i=1;i<nums.length;i++){
            left_products[i] = nums[i-1]*left_products[i-1];
        }
        //right products
        for(int i=n-2;i>=0;i--){
            right_products[i] = nums[i+1]*right_products[i+1];
        }
        for (int i = 0; i < output_array.length; i++) {
            output_array[i] = right_products[i]*left_products[i];
        }
        return output_array;

    }
    public static void main(String[] args) {
        /*
        Input: nums = [1,2,3,4]
        Output: [24,12,8,6]
         */

        int nums[] = {1,2,3,4};
        int res[]=productExceptSelf(nums);
        for(int i : res)
        System.out.println(i);
    }
}
/*
Constraints:
2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
 */
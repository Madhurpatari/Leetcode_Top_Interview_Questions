/*
283. Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
 */
public class Leetcode_283{
    public static void moveZeroes(int[] nums){
        int count= 0,j=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }else{
                count++;
            }
        }
        for (int i = nums.length-count; i < nums.length; i++) {
            nums[i]=0;
        }
    }
    public static void main(String[] args) {
        int nums[]= {0,1,0,3,12};
        moveZeroes(nums);
    }
}
/*two sum */
public class Leetcode_1 {
    public static  int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        for(int i =0;i<nums.length-1;i++){
            for(int j =i+1;j<nums.length;j++){
                if(target-nums[i]==nums[j]){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] ={2,7,5,11};
        int target = 9;
        int ans[] = twoSum(nums, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]+" ");
        }
    }
}

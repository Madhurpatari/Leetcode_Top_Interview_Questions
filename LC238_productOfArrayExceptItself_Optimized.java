public class LC238_productOfArrayExceptItself_Optimized{
    public static int[] productExceptSelf(int nums[]){
        int n = nums.length;
        int output_array[] = new int[n];
        output_array[0] =1;

        for (int i = 1; i < output_array.length; i++) {
            output_array[i] = output_array[i-1]*nums[i-1];
        }

        int R = 1;
        for(int i=n-1;i>=0;i--){
            output_array[i] = output_array[i] * R; 
            R= R*nums[i];
        }
        return output_array;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int ans[]=productExceptSelf(nums);
        for(int i : ans){
            System.out.println(i);
        }
    }
}

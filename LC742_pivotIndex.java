public class LC742_pivotIndex{
    public static int pivotIndex(int[] nums){
        int n = nums.length;
        int left_sum[] = new int[n];
        int right_sum[] = new int[n];
        int sum =0;
        for(int i=0;i<n;i++){
            sum = sum + nums[i];
            left_sum[i] = sum;
        }
        sum =0;
        for(int i=n-1;i>=0;i--){
            sum = sum + nums[i];
            right_sum[i] = sum;
        }

        int i=0;
        int j=0;
        while(i<left_sum.length && j < right_sum.length){
            if(left_sum[i]==right_sum[j]){
                return i;
            }
            i++;
            j++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}
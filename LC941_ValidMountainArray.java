public class LC941_ValidMountainArray{
    public static boolean isValidMountainArray(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left]<arr[left+1]) left++;
            else if(arr[right]<arr[right-1]) right--;
            else break;
        }
        return left != 0 && right != arr.length-1 && left ==right;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,4,3,2,1};
        System.out.println(isValidMountainArray(arr));
    }
}
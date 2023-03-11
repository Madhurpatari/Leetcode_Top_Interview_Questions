import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_15 {
    public static List<List<Integer>> three_sum(int[] a,int n){
        Arrays.sort(a);
        List<List<Integer>> output_arr =  new ArrayList<>();
        for(int i =0 ;i<n;i++){
            if(i==0 || (i>0 && a[i] != a[i-1])){
                int low = i+1;
                int high = n-1;
                int sum = 0-a[i];

                while(low<high){
                    if(a[low]+a[high]==sum){
                        output_arr.add(Arrays.asList(a[i],a[low],a[high]));
                        while(low<high && a[low]==a[low+1]) low++;
                        while(low<high && a[high]==a[high-1]) high--;
                        low++;
                        high--;
                    }
                    else if(a[low]+a[high]>sum) high--;
                    else low++;
                }
            }
        }
        return output_arr;
    }
    public static void main(String[] args) {
        
    }
}

import java.util.ArrayList;
import java.util.List;

public class LC442_findAllDuplicatesInArray{
    public static List<Integer> findDuplicates(int[] nums){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i])-1;
            if(nums[idx]<0){
                list.add(Math.abs(nums[i]));
            }
            nums[idx]=-nums[idx];
        }
        return list;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,4,7,3,2,3,8};
        System.out.println(findDuplicates(nums));

    }
}
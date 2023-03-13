
/*
42. Trapping Rain Water
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
 */
public class LC42_trappingRainWater {
    static int result =0;
    public static int trap(int[] height){
        int n = height.length;
        int[] maxl = new int[height.length];
        int[] maxr = new int[height.length];

        maxl[0] = height[0];
        maxr[n-1] = height[n-1];

        //left maximum array
        int idx = 1;
        for (int i = 1; i < height.length; i++) {
            maxl[idx++] = Math.max(maxl[i-1],height[i] );
        }
        
        //right maximum array
        idx = n-2;
        for(int i= n-2;i>=0;i--){
            maxr[idx--]= Math.max(maxr[i+1],height[i]);
        }

        int compare[] = new int[n];
        for (int i = 0; i < compare.length; i++) {
            compare[i] = Math.min(maxl[i], maxr[i]);
        }

        for (int i = 0; i < compare.length; i++) {
            int temp = compare[i]-height[i];
            result += temp;
        }
        return result;
    }
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}

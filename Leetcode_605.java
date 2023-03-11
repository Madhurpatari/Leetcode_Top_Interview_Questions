public class Leetcode_605{
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int count = 0;
        for(int i = 1;i<len-1;i++){
            if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                count++;
            }
        }
        return count >= n;
    }
    public static void main(String[] args) {
        int flowerbed[] = {1,0,0,0,1};
        int n =1;
        boolean ans =canPlaceFlowers(flowerbed, n);
        System.out.println(ans);
    }
}
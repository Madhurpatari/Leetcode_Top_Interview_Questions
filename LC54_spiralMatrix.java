import java.util.ArrayList;
import java.util.List;

public class LC54_spiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> output_arr = new ArrayList<>();
        int rowBegin =0;
        int colBegin =0;
        int rowEnd = matrix.length-1;
        int colEnd = matrix[0].length-1;

        while(rowBegin <= rowEnd && colBegin <= colEnd){
            //top waLL
            for(int j= colBegin;j<=colEnd;j++){
                output_arr.add(matrix[rowBegin][j]);
            }
            rowBegin++;

            //right wall
            for(int i =rowBegin; i<=rowEnd;i++){
                output_arr.add(matrix[i][colEnd]);
            }
            colEnd--;
            //bottom wall
            if(rowBegin <= rowEnd){
                for(int j= colEnd ; j>= colBegin;j--){
                    output_arr.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;

            //left wall 
            if(colBegin <= colEnd){
                for(int i=rowEnd; i>=rowBegin;i--){
                    output_arr.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return output_arr;
    }
    public static void main(String[] args) {
        int matrix[][] ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
}

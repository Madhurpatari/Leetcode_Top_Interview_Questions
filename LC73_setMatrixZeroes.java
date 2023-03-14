public class LC73_setMatrixZeroes {
    public static void makeRowZero(int[][] matrix, int row){
        for(int i= 0;i<matrix[row].length;i++){
            matrix[row][i] = 0;
        }
    }
    public static void makeColZero(int[][] matrix, int col){
        for(int i= 0;i<matrix.length;i++){
            matrix[i][col] = 0;
        }
    }
    public static void setZeroes(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;

        boolean[][] isZero = new boolean[n][m];
        for (int i = 0; i<n; i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    isZero[i][j]=true;
                }
            }
        }
        for (int i = 0; i<n; i++){
            for(int j=0;j<m;j++){
                if(isZero[i][j]){
                    makeRowZero(matrix, i);
                    makeColZero(matrix, j);
                }
            }
        }
        for (int i = 0; i<n; i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
    }
        

    public static void main(String[] args) {
        int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
    }
}

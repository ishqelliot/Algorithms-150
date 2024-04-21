public class Search2DMatrix {

    boolean execute(int[][] matrix, int target){
        int row = matrix.length-1;
        for(int i=0;i<matrix.length-1;i++){
            if(target>=matrix[i][0] && target<matrix[i+1][0]){
                row=i;
            }
        }
        for(int i=0;i<matrix[row].length;i++){
            if(matrix[row][i] == target){
                return true;
            }
        }
        return false;
    }
}

public class ValidSudoku {

    boolean execute(char[][] board){
        int[][] row = new int[9][9];
        int[][] column = new int[9][9];
        int[][] square = new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    int num = board[i][j] - '1';
                    int sq = (i/3) + (j / 3)*3;
                    if(++row[i][num]>1 || ++column[j][num]>1 || ++square[sq][num]>1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

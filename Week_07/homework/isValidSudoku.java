class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows=new int[9][10];
        int[][] cols=new int[9][10];
        int[][] boxes=new int[9][10];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.')continue;
                int nums=board[i][j]-'0';
                rows[i][nums]++;
                cols[j][nums]++;
                boxes[(i/3)*3+j/3][nums]++;
                if(rows[i][nums]+cols[j][nums]+boxes[(i/3)*3+j/3][nums]>3){
                    return false;
                }
            }
        }
        return true;
    }
}
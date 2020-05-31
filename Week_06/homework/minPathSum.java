class Solution {
    public int minPathSum(int[][] grid) {
        int rows=grid.length;
        if(rows==0)return 0;
        int cols=grid[0].length;
        if(cols==0)return 0;
        int[][] dp=new int[rows][cols];
        dp[0][0]=grid[0][0];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0&&j==0){
                    continue;
                }
                else if(i==0){
                    dp[i][j]=dp[i][j-1]+grid[i][j];
                }
                else if(j==0){
                    dp[i][j]=dp[i-1][j]+grid[i][j];
                }
                else{
                    dp[i][j]=Math.min(dp[i][j-1],dp[i-1][j])+grid[i][j];
                }
            }
        }
        return dp[rows-1][cols-1];
    }
}
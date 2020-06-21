class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        boolean[][] dp=new boolean[s.length()][s.length()];
        for(int j=0;j<s.length();j++){
            for(int i=0;i<=j;i++){
                if(s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1])){
                    dp[i][j]=true;
                    ans=s.substring(i,j+1).length()>ans.length()?s.substring(i,j+1):ans;
                }
            }
        }
        return ans;
    }
}
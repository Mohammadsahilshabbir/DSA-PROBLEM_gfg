class Solution {
    public int maxGold(int[][] mat) {
        // code here
        int m=mat.length;
        int n=mat[0].length;
        
        int max=0;
        Integer[][] dp=new Integer[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                max=Math.max(max,helper(i,j,mat,dp));
            }
    }
        return max;
}
    public int helper(int i,int j,int[][] mat,Integer[][] dp){
        if(i<0|| i>=mat.length || j>=mat[0].length) return 0;
        
        if(dp[i][j]!=null) return dp[i][j];
        
        int diagright_dwn=helper(i+1,j+1,mat,dp);
        int right=helper(i,j+1,mat,dp);
        int diag_rt_up=helper(i-1,j+1,mat,dp);
        
        
        
        return dp[i][j]=mat[i][j]+Math.max(diagright_dwn,(Math.max(right,diag_rt_up)));   
    }
}
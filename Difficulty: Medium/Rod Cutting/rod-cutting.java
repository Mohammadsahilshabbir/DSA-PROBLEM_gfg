class Solution {
    public int cutRod(int[] price) {
        // code here
        int rodlen=price.length;
        Integer[][] dp=new Integer[rodlen+1][rodlen+1];
        return helper(rodlen,price,rodlen,dp);
        
    }
    public int helper(int i,int[] price,int target,Integer[][] dp){
        if(target==0) return 0;
        if(i==0) return Integer.MIN_VALUE;
        if(dp[i][target]!=null) return dp[i][target];
        int take=0;
        if(i<=target){
            take=price[i-1]+helper(i,price,target-i,dp);
        }
        int notTake=helper(i-1,price,target,dp);
        return dp[i][target]=Math.max(take,notTake);
    }
}
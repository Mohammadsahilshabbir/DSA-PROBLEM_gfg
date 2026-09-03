class Solution {
    int minCost(int[] height) {
        // code here
        int[] dp=new int[height.length+1];
        Arrays.fill(dp,-1);
        return help(height,dp,0);
        
    }
    public int help(int[] height,int []dp,int i){
       if(i==height.length-1) return 0;
       if(dp[i]!=-1) return dp[i];
       int jump1=0;
       if(i+1<height.length){
       jump1=Math.abs(height[i]-height[i+1])+help(height,dp,i+1);
       }
       int jump2=Integer.MAX_VALUE;
       
       if(i+2<height.length){
       jump2=Math.abs(height[i]-height[i+2])+help(height,dp,i+2);
       }
       int ans=Math.min(jump1,jump2);
       return dp[i]=ans;
    }
    
    
}
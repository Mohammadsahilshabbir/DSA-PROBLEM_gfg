class Solution {
    public int minDifference(int arr[]) {
        // code here
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int target=sum/2;
        
        Integer[][] dp=new Integer[n+1][target+1];
        
        int s1=helper(n,arr,target,dp);
        
        int s2=sum-s1;
        
        return Math.abs(s1-s2);
        
    }
    
    public int helper(int idx,int[] arr,int target,Integer[][] dp){
        if(idx==0||target==0) return 0;
        if(dp[idx][target]!=null) return dp[idx][target];
        int notTake=helper(idx-1,arr,target,dp);
        
        int take=0;
        if(arr[idx-1]<=target){
            take=arr[idx-1]+helper(idx-1,arr,target-arr[idx-1],dp);
        }
        return dp[idx][target]=Math.max(take,notTake);
    }
}

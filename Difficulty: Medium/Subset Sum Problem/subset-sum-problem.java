class Solution {
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        
        
        int n = arr.length;
        Boolean dp[][] = new Boolean[n+1][sum+1]; 
        return helper(arr, sum, n, dp);
        
        
    }
    public static boolean helper(int arr[],int sum,int n,Boolean dp[][]){
        if(sum==0) return true;
        if(n==0) return false;
        if(dp[n][sum]!=null) return dp[n][sum];
        boolean nt=helper(arr,sum,n-1,dp);
        boolean take=false;
        if(arr[n-1]<=sum){
            take=helper(arr,sum-arr[n-1],n-1,dp);
        }
        dp[n][sum]=(take||nt);
        return dp[n][sum];
        
    }
}
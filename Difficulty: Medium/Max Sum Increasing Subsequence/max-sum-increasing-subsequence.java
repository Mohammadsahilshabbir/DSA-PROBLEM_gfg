class Solution {
    public int maxSumIS(int arr[]) {
        // code here
                int n=arr.length;
                int max=0;
                int[] dp=new int[n+1];
                for(int i=0;i<n;i++){
                    for(int j=0;j<=i-1;j++){
                        if(arr[j]<arr[i]){
                            dp[i]=Math.max(dp[i],dp[j]);
                        }
                    }
                    dp[i]=dp[i]+arr[i];
                    max=Math.max(dp[i],max);
                }
                return max;
    }
}
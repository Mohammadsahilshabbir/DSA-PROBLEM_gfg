// User function Template for Java

class Solution {
    public int[] findSum(int n) {
        // Code here
        int oddSum=0;
        int evenSum=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                evenSum+=i;
            }
            else{
                oddSum+=i;
            }
        }
        return new int[]{oddSum,evenSum};
    }
}
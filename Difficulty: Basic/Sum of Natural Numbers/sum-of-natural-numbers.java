class Solution {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    public static int findSum(int n) {
        // code here
        return sum(n);
    }
}

class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        if(n<1) return false;
        if(n==1) return true;
        if(n%2!=0) return false;
        while(n%2==0){
                n=n/2;
            }
            if(n==1) return true;
            else return false;
        
        //return true;
    }
}
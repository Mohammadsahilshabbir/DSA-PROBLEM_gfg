// User function Template for Java
class Solution {
    static long isPerfectSquare(long n) {
        // code here
        if(n<0) return 0;
        long sqrt=(long)Math.sqrt(n);
        if(sqrt*sqrt==n) return 1;
        else return 0;
    }
}
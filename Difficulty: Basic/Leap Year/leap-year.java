// User function Template for Java

class Solution {
    static boolean isLeap(int N) {
        // code here
        if(N%400==0) return true;
        if(N%100==0) return false;
        if(N%4==0) return true;
        
        return false;
    }
}
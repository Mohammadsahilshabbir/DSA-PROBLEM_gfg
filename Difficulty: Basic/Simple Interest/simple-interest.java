// User function Template for Java

class Solution {
    double simpleInterest(int P, int R, int T) {
        // code here
        double SI = (P * R * T) / 100.0;
        
        return Math.round(SI * 100.0) / 100.0;

    }
}
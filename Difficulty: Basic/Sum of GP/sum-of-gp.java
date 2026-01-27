// User function Template for Java

class Solution {
    public long sum_of_gp(long n, long a, long r) {
        // Code here
        if (r == 1) {
        
            return n * a;
        }
        long power = 1;
        
        
        for (int i = 0; i < n; i++) {
            power = power * r;
        }
        
        long sum = a * (power - 1) / (r - 1);
        return sum;
        
    }
}
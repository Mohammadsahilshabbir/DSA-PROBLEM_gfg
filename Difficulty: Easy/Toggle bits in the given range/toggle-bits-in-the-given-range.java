// User function Template for Java

class Solution {
    static int toggleBits(int n, int l, int r) {
        // code here
        int mask=0;
        for(int i=l;i<=r;i++){
            mask |= (1<<(i-1));
        }
        return n^mask;
    }
};
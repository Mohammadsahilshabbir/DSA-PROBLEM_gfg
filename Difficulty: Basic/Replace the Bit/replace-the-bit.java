// User function Template for Java

class Solution {
    int replaceBit(int N, int K) {
        int len=Integer.toBinaryString(N).length();
        if(K>len) return N;
        int pos=len-K;
        return ((~(1<<pos)) & N);
    }
}
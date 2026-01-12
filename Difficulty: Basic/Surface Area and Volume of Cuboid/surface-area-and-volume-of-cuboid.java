// User function Template for Java

class Solution {
    public int[] find(int l, int b, int h) {
        // code here
        int surfaceArea = 2 * (l * b + b * h + h * l);
        int volume = l * b * h;
        
        return new int[]{surfaceArea, volume};

    }
}
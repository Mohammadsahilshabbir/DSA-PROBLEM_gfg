// User function Template for Java

class Solution {
    public int distance(int x1, int y1, int x2, int y2) {
        // Code here
        int dx = x2 - x1;
        int dy = y2 - y1;
        
        
        double dist = Math.sqrt(dx * dx + dy * dy);
        
        
        return (int)Math.round(dist);
    }
}
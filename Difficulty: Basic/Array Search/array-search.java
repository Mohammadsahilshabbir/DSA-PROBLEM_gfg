// User function Template for Java
class Solution {
    public int search(int k, ArrayList<Integer> arr) {
        // code here
        int n=arr.size();
        for(int i=0;i<n;i++){
            if(arr.get(i)==k) return i+1;
        }
        return -1;
    }
}
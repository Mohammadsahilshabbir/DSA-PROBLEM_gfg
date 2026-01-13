
class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int j=1;
        int i=0;
        while(i<n && j<n){
            if(i!=j && (arr[j]-arr[i])==x) return true;
            else if(arr[j]-arr[i]<x){
             j++;
            }           
            else {
                i++;
            }
        }
        return false;
    }
}

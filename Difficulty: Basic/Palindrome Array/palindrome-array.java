
class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
        int n=arr.length;
        int j=n-1;
        int i=0;
        while(i<j){
            if(arr[i]!=arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}

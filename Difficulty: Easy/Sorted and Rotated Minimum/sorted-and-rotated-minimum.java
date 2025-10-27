// User function Template for Java

class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int start=0;
        int end=arr.length-1;
        
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]>arr[end]){//left part sort hai
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return arr[start];
    }
}




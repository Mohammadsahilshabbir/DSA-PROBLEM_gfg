class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int start=0;
        int end=arr.length-1;

        int maxcap=0;
        while(start<end){
            int h=Math.min(arr[start],arr[end]);
            int width=end-start;
            int currcap=h*width;

            maxcap=Math.max(currcap,maxcap);
            if(arr[start]<arr[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxcap;
    }
}
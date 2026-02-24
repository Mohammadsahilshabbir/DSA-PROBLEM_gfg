class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE, midindex=0;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    midindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[midindex];
            arr[midindex]=temp;
        }
    }
}
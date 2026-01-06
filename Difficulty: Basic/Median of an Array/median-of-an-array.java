class Solution {
    public double findMedian(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2==0){
            int mid1=arr[n/2];
            int mid2=arr[(n/2)-1];
            return (mid1+mid2)/2.0;
        }
        else return arr[n/2];
    }
}

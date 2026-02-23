class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int n=arr.length;
        int count0=0;
        int max0=0;
        int count1 = 0, max1 = 0;


            for(int j=0;j<n;j++){
                if(arr[j]==0){
                    count0++;
                    max0 = Math.max(max0, count0);
                    count1 = 0;
                }else{
                    count1++;
                max1 = Math.max(max1, count1);
                count0 = 0;
                }
        }
        return Math.max(max0, max1);

    }
}

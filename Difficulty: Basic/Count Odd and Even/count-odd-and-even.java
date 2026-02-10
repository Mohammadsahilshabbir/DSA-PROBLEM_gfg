class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int oddct=0;
        int evnct=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                oddct++;
            }else{
                evnct++;
            }
        }
        return new int[]{oddct, evnct};
    }
}
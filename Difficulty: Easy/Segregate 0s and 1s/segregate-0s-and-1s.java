// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int num_zero=0;
        int num_one=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==0) num_zero++;
        //     else num_one++;
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(i<num_zero) arr[i]=0;
        //     else arr[i]=1;
        // }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) num_zero++;
        }
        for(int i=0;i<num_zero;i++){
            arr[i]=0;
        }
        for(int i=num_zero; i<arr.length;i++){
            arr[i]=1;
        }
    }
}

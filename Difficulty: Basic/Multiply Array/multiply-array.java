
class Solution {

    public static int product(int arr[], int n) {
        int result=1;
        for(int i=0;i<=n-1;i++){
            result=result*arr[i];
        }
        return result;
    }
}

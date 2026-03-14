class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        // int n=arr.length;
        // int low=0,high=n-1,idx1=-1,idx2=-1;
        // while(low<=high){
        //     int mid=(low+high)/2;
        //     if(arr[mid]==x){
        //         idx1=mid;
        //         high=mid-1;
        //     }
        //     else if(arr[mid]<x){
        //         low=mid+1;
        //     }else{
        //         high=mid-1;
        //     }
        // }
        // low=0;
        // high=n-1;
        // while(low<=high){
        //     int mid=(low+high)/2;
        //     if(arr[mid]==x){
        //         idx2=mid;
        //         low=mid+1;
        //     }
        //     else if(arr[mid]<x){
        //         low=mid+1;
        //     }else{
        //         high=mid-1;
        //     }
        // }
        // ans.add(idx1);
        // ans.add(idx2);
        
        // return ans;
        int idx1=-1;
        int idx2=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x) {
                idx1=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==x) {
                idx2=i;
                break;
            }
        }
        ans.add(idx1);
        ans.add(idx2);
        return ans;
    }
}

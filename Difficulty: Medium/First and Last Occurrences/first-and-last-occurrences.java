class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int n=arr.length;
        int low=0,high=n-1,idx1=-1,idx2=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                idx1=mid;
                high=mid-1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        low=0;
        high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                idx2=mid;
                low=mid+1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        ans.add(idx1);
        ans.add(idx2);
        
        return ans;
    }
}

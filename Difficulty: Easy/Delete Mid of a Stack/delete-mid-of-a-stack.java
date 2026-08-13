class Solution {
    public void deleteMid(Stack<Integer> s) {
        // code here
        int n=s.size();
        delete(s,n,0);
       
    }
    public void delete(Stack<Integer> s, int n,int k){
        if(k==n/2) {
            s.pop();
            return;
        }
        int x=s.pop();
        
        delete(s,n,k+1);
        
        s.push(x);
    }
}
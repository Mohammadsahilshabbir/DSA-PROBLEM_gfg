// User function Template for Java
class Solution {
    int findLength(String s) {
        // code here
        String str=s.trim();
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                count++;
            }else break;
        }
        return count;
    }
}
class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> st=new Stack<>();
        for(int i=0;i<S.length();i++){
            st.push(S.charAt(i));
        }
        String emp="";
        while(!st.isEmpty()){
            emp=emp+st.pop();
            
        }
        return emp;
    }
}

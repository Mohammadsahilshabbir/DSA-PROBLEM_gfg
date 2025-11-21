// User function Template for C++

// Complete this function
class Solution {
  public:
    void reverseArray(vector<int>& arr) {
        stack<int> st;
        // Your code here
        for(int i=0;i<arr.size();i++){
            st.push(arr[i]);
        }
        // Reverse the array
        for(int i=0;i<arr.size();i++){
            arr[i]=st.top();
            st.pop();
        }
    }
};
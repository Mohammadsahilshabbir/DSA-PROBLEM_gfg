// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
        String result = "";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (!result.contains("" + ch)) {
                result += ch;
            }
        }
        
        return result;
    }
}
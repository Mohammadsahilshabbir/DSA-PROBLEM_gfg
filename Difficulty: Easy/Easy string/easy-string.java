// User function Template for Java
class Solution {
    String transform(String S) {
        // code here
        S = S.toLowerCase();
        
        StringBuilder result = new StringBuilder();
        int n = S.length();
        
        int count = 1; 
        for (int i = 1; i < n; i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                
                count++;
            } else {
                result.append(count).append(S.charAt(i - 1));
                count = 1; 
            }
        }
        result.append(count).append(S.charAt(n - 1));
        
        return result.toString();

    }
}


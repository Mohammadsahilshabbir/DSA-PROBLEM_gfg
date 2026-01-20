// User function Template for Java

class Sol {
    int[] count(String s) {
        // your code here
         int upper = 0, lower = 0, digit = 0, special = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isDigit(ch)) {
                digit++;
            } else {
                special++;
            }
        }
        
        return new int[]{upper, lower, digit, special};
    }
}
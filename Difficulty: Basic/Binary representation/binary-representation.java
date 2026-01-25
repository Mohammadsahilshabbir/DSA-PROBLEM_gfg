class Solution {
    static String getBinaryRep(int n) {
        // code here
        StringBuilder sb = new StringBuilder();

        for (int i = 31; i >= 0; i--) {
            sb.append((n >> i) & 1);
        }

        return sb.toString();
    }
}
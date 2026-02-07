// User function Template for Java

class Solution {
    // Function to find the minimum value required to balance the array.
    public int minValueToBalance(List<Integer> arr) {
        // code here
        int n = arr.size();
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < n / 2; i++) {
            sum1 += arr.get(i);
        }

        for (int i = n / 2; i < n; i++) {
            sum2 += arr.get(i);
        }

        return Math.abs(sum2-sum1);
    }
}
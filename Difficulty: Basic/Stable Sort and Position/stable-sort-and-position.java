// User function Template for Java

class Solution {
    // Function to get the index of an element in a sorted array
    public int getIndexInSortedArray(int[] arr, int k) {
        // Write Code Here
        int x = arr[k];
        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
                pos++;
            } else if (arr[i] == x && i < k) {
                pos++;
            }
        }
        return pos;
    }
}

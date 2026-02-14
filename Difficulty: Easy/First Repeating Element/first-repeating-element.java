class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        int n = arr.length;

        // Outer loop for each element
        for (int i = 0; i < n; i++) {
            // Inner loop to check if arr[i] repeats later
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return i + 1; // One-based index of first occurrence
                }
            }
        }

        // No repeats found
        return -1;

    }
}

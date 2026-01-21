

class Solution {
    public int DiagonalSum(int[][] matrix) {
        // code here
        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];           
            sum += matrix[i][n - 1 - i];  
        }

       

        return sum;
    }
}
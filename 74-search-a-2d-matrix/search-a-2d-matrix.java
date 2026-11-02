class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        
        int low = 0;
        int high = (m * n) - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Map 1D index back to 2D coordinates
            int row = mid / n;
            int col = mid % n;
            int midValue = matrix[row][col];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                low = mid + 1; // Search the right half
            } else {
                high = mid - 1; // Search the left half
            }
        }

        return false;
    }
}
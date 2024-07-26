class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int i = 0;

        while (i < matrix.length-1) {
            if (matrix[i][0] == target || matrix[i][m-1] == target) {
                return true;
            }

            if (matrix[i][0] < target && matrix[i][m-1] > target) {
                break;
            }
            i++;
        }

        for (int j = 0; j < m; j++) {
            if (matrix[i][j] == target) {
                return true;
            }
        }

        return false;
    }
}
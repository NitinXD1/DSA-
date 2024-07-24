import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int [][] arr = {{1,1,1,1},{1,0,1,1},{1,1,0,1},{0,1,1,1}};
        setZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
    }
        public static void setZeroes(int[][] matrix) {

//            int [] newrow = new int[matrix.length]; --> matrix[0][..]
//            int [] newcol = new int[matrix[0].length]; --> matrix[..][0]
            int col0 = 1;  // This keeps track of whether the first column should be zero
            int rows = matrix.length;
            int cols = matrix[0].length;

            // First pass: use the first row and first column as markers.
            for (int row = 0; row < rows; row++) {
                if (matrix[row][0] == 0) col0 = 0; // If any element in the first column is zero, set col0 to 0
                for (int col = 1; col < cols; col++) {
                    if (matrix[row][col] == 0) {
                        matrix[row][0] = 0; // Mark the first cell of the row
                        matrix[0][col] = 0; // Mark the first cell of the column
                    }
                }
            }

            // Second pass: use the markers to set elements to zero
            for (int row = 1; row < rows; row++) {
                for (int col = 1; col < cols; col++) {
                    if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                        matrix[row][col] = 0;
                    }
                }
            }

            // Finally, set the first row and first column to zero if needed
            if (matrix[0][0] == 0) {
                for (int col = 0; col < cols; col++) {
                    matrix[0][col] = 0;
                }
            }

            if (col0 == 0) {
                for (int row = 0; row < rows; row++) {
                    matrix[row][0] = 0;
                }
            }
//            for (int row = 0; row < matrix.length; row++) {
//                for (int col = 0; col < matrix[row].length; col++) {
//                    if (newrow[row] == 1 || newcol[col] == 1) {
//                        matrix[row][col] = 0;
//                    }
//                }
//            }


        }
}

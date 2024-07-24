import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    public static void rotate(int[][] matrix) {
        //finding transpose
        for (int row = 0; row <matrix.length ; row++) {
            for (int col = row+1; col <matrix[0].length ; col++) {
                swap(matrix,row,col);
            }
        }
        int n = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    static void swap(int[][] arr,int start,int end){
        int temp = arr[start][end];
        arr[start][end] = arr[end][start];
        arr[end][start] = temp;
    }
}

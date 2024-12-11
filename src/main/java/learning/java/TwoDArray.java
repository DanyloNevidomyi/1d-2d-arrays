package learning.java;

public class TwoDArray {
    private double[][] matrix;

    public TwoDArray(double[][] matrix) {
        this.matrix = matrix;
    }

    public boolean isDiagonal() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void printMatrix() {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}

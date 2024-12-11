package learning.java;

public class OneDArray {
    private double[] array;

    public OneDArray(double[] array) {
        this.array = array;
    }

    public double[] normalizeArray() {
        double sumOfSquares = 0;
        for (double num : array) {
            sumOfSquares += num * num;
        }
        double L = Math.sqrt(sumOfSquares);

        for (int i = 0; i < array.length; i++) {
            array[i] /= L;
        }
        return array;
    }

    public void printArray() {
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

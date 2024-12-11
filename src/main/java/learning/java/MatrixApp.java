package learning.java;

import java.util.Scanner;

public class MatrixApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1d масив
        System.out.println("Введіть довжину масиву: ");
        int length = scanner.nextInt();
        double[] array = new double[length];

        System.out.println("Введіть елементи масиву: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextDouble();
        }

        OneDArray oneDArray = new OneDArray(array);
        oneDArray.normalizeArray();

        System.out.println("Нормалізований масив:");
        oneDArray.printArray();

        // 2d масив
        System.out.println("\nВведіть розмір матриці N: ");
        int N = scanner.nextInt();
        double[][] matrix = new double[N][N];

        System.out.println("Введіть елементи матриці у форматі таблиці:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        TwoDArray twoDArray = new TwoDArray(matrix);

        System.out.println("\nВведена матриця:");
        twoDArray.printMatrix();

        if (twoDArray.isDiagonal()) {
            System.out.println("\nМатриця є діагональною.");
        } else {
            System.out.println("\nМатриця не є діагональною.");
        }
    }
}

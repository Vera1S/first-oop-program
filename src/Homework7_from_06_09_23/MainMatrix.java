package Homework7_from_06_09_23;

public class MainMatrix {
    public static void main(String[] args) {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};

        System.out.println("Умножение");

        int[][] C = TheMatrix.multiply(A, B);

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("Сложение");
        int[][] C1 = TheMatrix.add(A, B);

        for (int i = 0; i < C1.length; i++) {
            for (int j = 0; j < C1[0].length; j++) {
                System.out.print(C1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Вычетание");
        int[][] C2 = TheMatrix.subtract(A, B);

        for (int i = 0; i < C2.length; i++) {
            for (int j = 0; j < C2[0].length; j++) {
                System.out.print(C2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
    }
}

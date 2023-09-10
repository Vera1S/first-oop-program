package Homework7_from_06_09_23;

public class TheMatrix {
    // Функция для сложения матриц
    public static int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C1 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C1[i][j] = A[i][j] + B[i][j];
            }
        }
        return C1;
    }

    // Функция для вычитания матриц
    public static int[][] subtract(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C2[i][j] = A[i][j] - B[i][j];
            }
        }
        return C2;
    }

    // Функция для умножения матриц методом Штрассена
    public static int[][] multiply(int[][] A, int[][] B) {
        int n = A.length;

        if (n == 1) {
            return new int[][] {{A[0][0] * B[0][0]}};
        }

        // Разделение матриц на четверти
        int[][] A11 = new int[n/2][n/2];
        int[][] A12 = new int[n/2][n/2];
        int[][] A21 = new int[n/2][n/2];
        int[][] A22 = new int[n/2][n/2];

        int[][] B11 = new int[n/2][n/2];
        int[][] B12 = new int[n/2][n/2];
        int[][] B21 = new int[n/2][n/2];
        int[][] B22 = new int[n/2][n/2];

        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < n/2; j++) {
                A11[i][j] = A[i][j];
                A12[i][j] = A[i][j + n/2];
                A21[i][j] = A[i + n/2][j];
                A22[i][j] = A[i + n/2][j + n/2];

                B11[i][j] = B[i][j];
                B12[i][j] = B[i][j + n/2];
                B21[i][j] = B[i + n/2][j];
                B22[i][j] = B[i + n/2][j + n/2];
            }
        }

        // Вычисление подпроизведений
        int[][] P1 = multiply(A11, subtract(B12, B22));
        int[][] P2 = multiply(add(A11, A12), B22);
        int[][] P3 = multiply(add(A21, A22), B11);
        int[][] P4 = multiply(A22, subtract(B21, B11));
        int[][] P5 = multiply(add(A11, A22), add(B11, B22));
        int[][] P6 = multiply(subtract(A12, A22), add(B21, B22));
        int[][] P7 = multiply(subtract(A11, A21), add(B11, B12));

        // Вычисление результатов
        int[][] C11 = add(subtract(add(P5, P4), P2), P6);
        int[][] C12 = add(P1, P2);
        int[][] C21 = add(P3, P4);
        int[][] C22 = add(subtract(add(P5, P1), P3), P7);

        // Собираем результат в одну матрицу
        int[][] C = new int[n][n];
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < n/2; j++) {
                C[i][j] = C11[i][j];
                C[i][j + n/2] = C12[i][j];
                C[i + n/2][j] = C21[i][j];
                C[i + n/2][j + n/2] = C22[i][j];
            }
        }

        return C;
    }


}

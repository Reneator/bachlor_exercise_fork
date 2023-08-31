package src;

import java.util.Random;

public class Matrix {


    //Jede Matrix ist nach Rows im int array gespeichert


    //Diese Funktion geht momentan davon aus dass alle arrays ordentlich gefüllt sind um eine gleichmäßige Matrix zu erzeugen.
    //andersfalls müsste man eine funktion einbauen, die auf unregelmäßigkeiten prüft


    public static boolean isSquareMatrix(int[][] matrix) {
        if (matrix.length == 0) {
            return true;
        }
        checkProperMatrix(matrix);

        return matrix.length == matrix[0].length;
    }

    //https://stackoverflow.com/questions/15449711/transpose-double-matrix-with-a-java-function
    public static int[][] transpose(int[][] m) {
        checkProperMatrix(m);

        int[][] temp = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                temp[j][i] = m[i][j];
        return temp;
    }


    //http://www.java2s.com/example/java-utility-method/matrix-flip/fliplefttoright-int-thearray-d8ca3.html
    public static int[][] mirrorMatrix(int[][] matrix) {
        checkProperMatrix(matrix);

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] tmp = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int curr = 0; curr < (cols + 1) / 2; curr++) {
                int saved = matrix[i][curr];
                tmp[i][curr] = matrix[i][cols - 1 - curr];
                tmp[i][cols - 1 - curr] = saved;
            }
        }
        return tmp;
    }


    //clockwise or counterclockwise?
    //https://www.javatpoint.com/rotate-matrix-by-90-degrees-in-java

    public static int[][] rotate90Degrees(int[][] matrix) {
        checkProperMatrix(matrix);
        int[][] afterTranspose = transpose(matrix);
        int[][] afterMirror = mirrorMatrix(afterTranspose);
        return afterMirror;
    }


    public static int sumDiagonal(int[][] matrix) {
        if (!isSquareMatrix(matrix)) {
            throw new IllegalArgumentException("Die src.Matrix muss quadratisch sein.");
        }
        checkProperMatrix(matrix);

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }


    public static int[][] hadamardProduct(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;

        if (rows != matrixB.length || cols != matrixB[0].length) {
            throw new IllegalArgumentException("Die Matrizen müssen die gleiche Größe haben.");
        }

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[j][i];
            }
        }

        return result;
    }

    public static void sortMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] arr = new int[rows * cols + 1];
        int index = 0;
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[index++] = matrix[i][j];
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        index = 0;
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = arr[index++];
            }
        }
    }

    public static int[][] generateRandomMatrix(int n, int m) {
        int[][] matrix = new int[n][m];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }

    public static boolean isProperMatrix(int[][] matrix) {

        if (matrix.length <= 0) {
            return false;
        }

        int row_length = matrix[0].length; //Wenn die Matrix rows enthält, kann ich einfach die erste row nutzen um die benötigte row länge festzulegen, auf die geprüft wird

        //Da die Matrix row basiert ist, muss ich nur prüfen ob alle arrays in der matrix gleich lang sind

        for (int[] row : matrix) {
            if (row.length != row_length) {
                return false;
            }
        }
        return true;

    }

    public static void checkProperMatrix(int[][] matrix) {
        if (!isProperMatrix(matrix)) {
            throw new RuntimeException("Non proper Matrix!");
        }
    }
}


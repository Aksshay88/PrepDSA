public class matrixfilling {
    public static void modifyMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        boolean firstRow = false, firstCol = false;
        for (int j = 0; j < n; j++) {
            if (mat[0][j] == 1) {
                firstRow = true;
                break;
            }
        }
        for (int i = 0; i < m; i++) {
            if (mat[i][0] == 1) {
                firstCol = true;
                break;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (mat[i][j] == 1) {
                    mat[i][0] = 1;
                    mat[0][j] = 1;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (mat[i][0] == 1 || mat[0][j] == 1) {
                    mat[i][j] = 1;
                }
            }
        }
        if (firstRow) {
            for (int j = 0; j < n; j++) {
                mat[0][j] = 1;
            }
        }
        if (firstCol) {
            for (int i = 0; i < m; i++) {
                mat[i][0] = 1;
            }
        }
    }
    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] mat1 = {
            {1, 0},
            {0, 0}
        };
        modifyMatrix(mat1);
        printMatrix(mat1);

        int[][] mat2 = {
            {0, 0, 0},
            {0, 0, 1}
        };
        modifyMatrix(mat2);
        printMatrix(mat2);

        int[][] mat3 = {
            {1, 0, 0, 1},
            {0, 0, 1, 0},
            {0, 0, 0, 0}
        };
        modifyMatrix(mat3);
        printMatrix(mat3);
    }
}


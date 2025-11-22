package uk.ac.cam.mp2226.part1a.oop.supo1;


public class Question1P8 {
    public static int[][] createMatrix(int n) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            result[i] = new int[n];
            for (int j = 0; j < n; j++) {
                result[i][j] = i == j ? 1 : 0;
            }
        }
        return result;
    }

    public static void transposeInplace(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i >= j) continue;
                int t = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = t;
            }
        }
    }
}

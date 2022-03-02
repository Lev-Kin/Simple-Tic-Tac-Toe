import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = scanner.nextInt();

            }
        }

        boolean isSymmetrical = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetrical = false;
                    break;
                }
            }
        }

        String result = isSymmetrical ? "YES" : "NO";
        System.out.println(result);

    }
}
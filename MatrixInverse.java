import java.util.Scanner;

public class MatrixInverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the order of matrix: ");
        int n = sc.nextInt();

        double[][] a = new double[n][2 * n];

        System.out.println("Enter matrix elements:");

        // Create augmented matrix [A | I]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextDouble();
            }

            a[i][i + n] = 1;
        }

        // Gauss-Jordan elimination
        for (int i = 0; i < n; i++) {

            if (a[i][i] == 0) {
                System.out.println("Inverse does not exist.");
                sc.close();
                return;
            }

            // Make diagonal element 1
            double divisor = a[i][i];

            for (int j = 0; j < 2 * n; j++) {
                a[i][j] = a[i][j] / divisor;
            }

            // Make other elements in this column 0
            for (int k = 0; k < n; k++) {

                if (k != i) {

                    double factor = a[k][i];

                    for (int j = 0; j < 2 * n; j++) {
                        a[k][j] = a[k][j] - factor * a[i][j];
                    }
                }
            }
        }

        // Display inverse
        System.out.println("Inverse of the matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = n; j < 2 * n; j++) {
                System.out.printf("%.2f ", a[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
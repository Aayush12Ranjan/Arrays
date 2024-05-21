package twoDarray;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row");
        int n = sc.nextInt();
        

        System.out.println("Enter the size of column");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        n=arr.length;
         m=arr[0].length;
        int trans[][] = new int[m][n]; // Correct size for transposed matrix

        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                trans[j][i] = arr[j][i];
            }
        }

        // Display the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

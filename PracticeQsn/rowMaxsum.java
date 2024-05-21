package PracticeQsn;

public class rowMaxsum {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4, 5},
            {3, 4, 5, 6, 7},
            {7, 6, 5, 4, 3},
            {8, 7, 6, 5, 4},
            {1, 2, 3, 7, 8}
        };

        int m = arr.length;
        int n = arr[0].length;
        int maxSum = Integer.MIN_VALUE;
        int rowIndex = -1;

        for (int i = 0; i < m; i++) {
            int currentRowSum = 0;
            for (int j = 0; j < n; j++) {
                currentRowSum += arr[i][j];
            }
            if (currentRowSum > maxSum) {
                maxSum = currentRowSum;
                rowIndex = i;
            }
        }

        System.out.println("Row with maximum sum is: " + rowIndex + " with sum: " + maxSum);
    }
}

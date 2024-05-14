public class DutchFlagAlgo {
    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 2, 1, 1, 0, 0, 2};
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }

        for (int k = 0; k < n; k++) { // Use k instead of j and i instead of j
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
}

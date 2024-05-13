import java.util.*;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
      
        int arr[] = new int[n];
        
        System.out.println("Enter the items of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Second Maximum value in the array: " + smax);
    }
}

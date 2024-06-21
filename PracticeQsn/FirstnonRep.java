package PracticeQsn;

public class FirstnonRep {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3, 4, 5, 4};
        int n = arr.length;
        int i = 0; 
        int j = n - 2;
        
        while (i <= j) {
            if (arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");
                break;
            }
            i++;
        }

        if (i > j) {
            System.out.print("No non-repeating element found");
        }
    }
}

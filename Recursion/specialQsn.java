package Recursion;
import java.util.*;

public class specialQsn {
    static ArrayList<Integer> ans = new ArrayList<>();

    static int print(int arr[], int idx) {
        int n=arr.length;
        if(n>=1) {
            ans.add(arr[idx]);
            return 0;
        }
        return print(arr, idx+1)+arr[idx];
      
       
        
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};

        ans = new ArrayList<Integer>(); // Initialize the ans list
        print(arr, 0); // Start recursion with the first index

        // Print the result in the desired format

        System.out.println(ans);
        
    }
}

package PracticeQsn;

import java.util.Scanner;

public class UniqueNumber {
    static boolean Unique(int arr[]){
        int n= arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    return false;
                }
            }
        }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();

        int arr[]= new int[n];
        System.out.println("Enter the array element");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

      if (Unique(arr)) {
        System.out.println("Uniqu element is present");
      }
      else{
        System.out.println("Unique element is not present");
      }
    }
    
}

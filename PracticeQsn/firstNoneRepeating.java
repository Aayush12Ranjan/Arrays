package PracticeQsn;

import java.util.Scanner;

public class firstNoneRepeating {
    static void nonRepeating(int arr[]){
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]) break;
                System.out.println(arr[j]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of Array");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        nonRepeating(arr);
        
    }
    
}

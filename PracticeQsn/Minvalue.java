package PracticeQsn;

import java.util.Scanner;

public class Minvalue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n= sc.nextInt();
        int arr[]= new int[n];
         n= arr.length;

        System.out.println("Enter the array items");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        // for first min

        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        // for second Min

       int smin=Integer.MAX_VALUE;
       for(int i=0; i<n; i++){
        if(arr[i]<smin && arr[i]!=min){
            smin=arr[i];
        }
       }

       System.out.println(smin+" ");
          
       
    }
    
}

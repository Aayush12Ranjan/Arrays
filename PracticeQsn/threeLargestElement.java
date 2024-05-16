package PracticeQsn;

import java.util.Scanner;

public class threeLargestElement {
    static void Larger(int arr[]){
        int n= arr.length;
      int mx=Integer.MIN_VALUE;
      for(int i=0; i<n; i++){
        if(arr[i]>mx)   mx=arr[i];  
      }
int smx=Integer.MIN_VALUE;
      for(int i=0; i<n; i++){
if(arr[i]>smx && arr[i]!=mx) smx=arr[i];
      }

      int thmx=Integer.MIN_VALUE;
      for(int i=0; i<n; i++) {
        if(arr[i]>thmx && arr[i]!=smx && arr[i]!=mx) thmx=arr[i];
      }
      System.out.println(mx+" "+ smx +" "+ thmx);
  
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
        Larger(arr);
    }
    
}

package PracticeQsn;

import java.util.*;

public class checkSorted {

    static boolean Sorted(int arr[]){
        int n= arr.length;
    

        for(int i=0; i<n-1; i++){  
         
                if(arr[i]>arr[i+1]){
                    return false;
                }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the array item");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

       if(Sorted(arr)){
        System.out.println("array is sorted");
       }
       else{
        System.out.println("array is not sorted");
       }
        
    }
    
}

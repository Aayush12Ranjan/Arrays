package PracticeQsn;
import java.util.*;
public class Palindrom {
    static void palindrom(int arr[]){
        int n= arr.length;
        int reve[]= new int[n];
        for(int i=0; i<n; i++){
           reve[n-i-1]=arr[i];
    
        }
        boolean flag=true;
        for(int i=0; i<n; i++){
        if(reve[i]!=arr[i]){
            flag=false;
        }
       
        }

        if(flag==true) {
            System.out.println("Given Array is palindrom");
        }
        else{
            System.out.println("Given Array is  not palindrom");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the array item");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        palindrom(arr);
    }
    
}

package PracticeQsn;
import java.util.*;

public class DuplicateElement {
    static void Findduplicate(int arr[]){
        int n= arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                  
                }
            }
        }

        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the Array element");
        for(int i=0; i<n; i++){
        arr[i]= sc.nextInt();
        }

        Findduplicate(arr);
    }
    
}

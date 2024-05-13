
import java.util.*;


public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the target");
        int target= sc.nextInt();

       
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the array item");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        
      boolean flag=false;
      for(int i=0; i<arr.length; i++){
        if(arr[i]==target){
           flag=true;
            break;
        }
      }
      if(flag==true) System.out.println("Element is found");
      else System.out.println("Element is not found");
    }
    
}

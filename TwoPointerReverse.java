
import java.util.*;


public class TwoPointerReverse {

    static void reverse(int arr[]){
        int n= arr.length;
        int i=0; 
        int j=n-1;
        while(i<j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
          i++;
          j--;
        }
        for( i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
      
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the array element");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        reverse(arr);
    }
    
}

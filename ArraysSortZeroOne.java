import java.util.*;

public class ArraysSortZeroOne {
    static void Sort(int arr[]){
        int n= arr.length;
        int i=0; 
        int j=n-1;
        while(i<=j){
            if(arr[i]==1 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the item");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
      Sort(arr);
      System.out.println("Sorted Array");
      for(int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
      
    }
    
}

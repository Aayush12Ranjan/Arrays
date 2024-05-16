import java.util.*;

public class GreatestElement {
    // static void Greatest(int arr[]){
    //     int n= arr.length;
    //     for(int i=0; i<n; i++){
    //         int max=0;
    //         for(int j=i+1; j<n; j++){
    //             if(arr[j]>max){
    //                 max=arr[j];
    //             }arr[i]=max;
    //         }
    //         arr[i]=max;
    //     }
    // }

    static void Greatest(int arr[]){
        int n= arr.length;

        int max=arr[n-1];

        for(int i=n-2; i>=0; i--){
            arr[i]=max;
            max=Math.max(max,arr[i]);
        }
    }




    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
      System.out.println("enter the size of Array");
      int n= sc.nextInt();

      int arr[]= new int[n];
      System.out.println("Enter the array element");
      for(int i=0; i<n; i++){
        arr[i]= sc.nextInt();
      }
       
Greatest(arr);

        for(int k=0; k<n; k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();

        
    }
    
}

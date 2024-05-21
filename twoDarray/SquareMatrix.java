package twoDarray;

import java.util.Scanner;

public class SquareMatrix {

    static void print(int[][]arr){
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
    }
    static void Transmatrix(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
              int temp=arr[i][j];
              arr[i][j]=arr[j][i];
              arr[j][i]=temp;
            }
           
           
        }
        print(arr);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of row");
        int m=sc.nextInt();

        System.out.println("Enter the number of column");
        int n= sc.nextInt();

        int arr[][]=new int[m][n];
        n=arr.length;
        m=arr[0].length;
        System.out.println("Enter the items");
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=sc.nextInt();
            }
        }
     Transmatrix(arr);

       
    }
    
}

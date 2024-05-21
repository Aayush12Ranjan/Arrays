package twoDarray;

import java.util.Scanner;

public class RotateMatrixAt90degree {
static void print(int arr[][]){
    int m=arr.length;
    int n=arr[0].length;
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
    static void Rotate(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0; i<m; i++){
            int a=0;
            int b=m-1;

            while(a<b){
                int temp=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=temp;
                a++;
                b--;
            }
        }
        print(arr);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the row and column");
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        int arr[][]= new int[m][n];
        System.out.println("Enter the array item");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        Rotate(arr);
    }
    
}

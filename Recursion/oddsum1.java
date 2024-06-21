package Recursion;

import java.util.Scanner;

public class oddsum1 {
    static int print(int n){
        
        if(n==0)  return 0;

        if(n%2!=0){
            return print(n-1)+n; 
        }

        else{
            return print(n-1)-n;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
       System.out.println(print(n));
    }
    
}

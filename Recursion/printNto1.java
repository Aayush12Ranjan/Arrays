package Recursion;

import java.util.Scanner;

public class printNto1 {
    static void print(int n){
        if(n==1) {
        System.out.println(1);
        return ;
        }

        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
       print(n);
        
    }
    
}

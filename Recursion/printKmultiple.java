package Recursion;
import java.util.*;
public class printKmultiple {
    static void print(int n,int k){
        if(k==0){
          
            return ;
        } 
       
        print(n, k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        System.out.println("enter the multipe");
        int k= sc.nextInt();
        print(n, k);
    }
    
}

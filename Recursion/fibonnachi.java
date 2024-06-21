package Recursion;
import java.util.*;
public class fibonnachi {
    static int fib(int n){
        int ans=0;
        if(n==0 || n==1) return n;
        ans=fib(n-1)+fib(n-2);
        
      

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        System.out.println(fib(n));
    }
    
}

package Recursion;
import java.util.*;
public class sum1ToN {
    static int sum1(int n){
        
        if(n==0) return 0;
       return n+sum1(n-1);



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(sum1(n));
    
}
}

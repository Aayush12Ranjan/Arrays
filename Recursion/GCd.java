package Recursion;
import java.util.*;
public class GCd {
    static int gcd(int a,int b){
      if(b%a==0) return a;

      return gcd(b%a, a);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
       System.out.println( gcd(a, b));
    }
    
}

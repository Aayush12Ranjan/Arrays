package Recursion;
import java.util.*;
public class oddsum {
    static void sum1(int n,int sum){
       

if(n==0){
    System.out.println(sum);
    return;
}
    if(n%2!=0) sum+=n;
    sum1(n-1,sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");     
        int n =sc.nextInt();
        
        sum1(n,0);
        
    }
    
}

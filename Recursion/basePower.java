package Recursion;

import java.util.Scanner;

public class basePower {
    static int power(int p,int q){
        int ans=0;
        if(q==0) return 1;
        ans=power(p,q/2);
        if(q%2==0) return ans*ans;
        else return ans*ans*p;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int p=sc.nextInt();
        System.out.println("Enter the power");
        int q=sc.nextInt();
      System.out.println(power(p,q));

    }
    
}

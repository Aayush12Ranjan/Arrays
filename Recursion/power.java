package Recursion;
import java.util.*;
public class power {
    static int  P(int p,int q){
        if(q==0) return 1;

        return P(p, q-1)*p;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int p=sc.nextInt();
        System.out.println("Enter the power");
        int q=sc.nextInt();

        System.out.println(P(p, q));
    }
    
}

package Recursion;
import java.util.*;
public class stairpath {
    static int stair(int n){
        if(n<=3) return n;

return stair(n-1)+stair(n-2)+stair(n-3);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        System.out.println(stair(n));
    }
    
}

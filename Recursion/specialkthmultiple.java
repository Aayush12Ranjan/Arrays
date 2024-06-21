package Recursion;
import java.util.*;
public class specialkthmultiple {
    static void print(int idx, int k ,String n,String ans){
        if(k<=4 && idx==s.length()){
            System.out.println(ans);
        }
        print(idx+1, k, s, ans);
        ans+=s.charAt(idx);
        print(idx+1, k, s, ans);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        String n= sc.nextLine();
        System.out.println("Enter k");
        int k= sc.nextInt();
       print(0, k, n, "");
        
    }
    
}

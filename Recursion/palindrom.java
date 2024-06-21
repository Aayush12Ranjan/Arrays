package Recursion;
import java.util.*;
public class palindrom {
    static void print(String s,int idx,String ans){
        if(idx==ans.length()){
        return;
        }

        print(s, idx+1, ans);
        char ch=s.charAt(idx);
        ans+=ch;

        if(s.charAt(idx)==ans.charAt(idx)){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not a valid palindrom");
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        print(s, 0, "");
    }
    
}

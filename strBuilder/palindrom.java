package strBuilder;

import java.util.*;
public class palindrom {
    static void reverse(StringBuilder s){
        int n=s.length();
        int i=0; int j=n-1;

        while(i<j){
            char temp=s.charAt(i);
          s.setCharAt(i, s.charAt(j));
          s.setCharAt(j, temp);
          i++;
          j--;
          
        } 
        
      
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        StringBuilder s=  new StringBuilder(sc.nextLine());
        reverse(s);

        
      
      
       
    
    }
    
}

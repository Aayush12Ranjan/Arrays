package strBuilder;

import java.util.*;
public class inputInstrBuilder {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the String");
        String s=  sc.nextLine();
        
        StringBuilder sb=new StringBuilder(s);
         sb.setCharAt(1, 'b');
        System.out.println(sb);
    }

    
}

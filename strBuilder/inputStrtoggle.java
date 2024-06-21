package strBuilder;

import java.util.*;
public class inputStrtoggle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String s= sc.nextLine();
        StringBuilder sb= new StringBuilder(s);
        for(int i=0; i<sb.length(); i++){

            char ch=sb.charAt(i);
            int asci=(int)ch;
            if(asci>=65 && asci<=90){
                asci+=32;
             ch=(char)asci;
             sb.setCharAt(i, ch);

            }

           else if(asci>=97 && asci<=122){
                asci-=32;
             ch=(char)asci;
             sb.setCharAt(i, ch);

            }
        }
        System.out.print(sb);
    }
    
}

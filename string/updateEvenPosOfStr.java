package string;

import java.util.*;
public class updateEvenPosOfStr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();

        int n=str.length();
        for(int i=0; i<n; i++){
            char ch=str.charAt(i);
            if(i%2==0 && !equal()){
                ch='a';
            }
            System.out.print(ch);
        }

       
    }
    
}

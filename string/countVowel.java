package string;

import java.util.Scanner;

public class countVowel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String str= sc.nextLine();


        int n=str.length();
        int count=0;
        for(int i=0; i<n; i++){
            char ch=str.charAt(i);
            if(isValue(ch)==true) count++;
            
        }
        System.out.println(count);
    }
        public static boolean isValue(char ch){
          if(ch=='a' || ch=='A') return true;
          if(ch=='e' || ch=='E') return true;
          if(ch=='i' || ch=='I') return true;
          if(ch=='o' || ch=='O') return true;
          if(ch=='u' || ch=='U') return true;
          return false;

       }
    }
    


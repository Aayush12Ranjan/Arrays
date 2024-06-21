package strBuilder;
import java.util.*;


public class anagram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First String");
        String a= sc.nextLine();

        System.out.println("Enter the Second String:");
        String b= sc.nextLine();

        char[] s=a.toCharArray();
        char[] t=b.toCharArray();

        Arrays.sort(s);
        Arrays.sort(t);
         boolean flag =true;
        for(int i=0; i<s.length; i++){
            if(s[i]!=t[i]){
               flag=false;
            }
        }

        if(flag==true){
            System.out.println("Valid Anagram");
        }
        else{
            System.out.println("Not valid anagram");
        }
    }
    
}

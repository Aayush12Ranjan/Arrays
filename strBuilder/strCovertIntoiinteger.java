package strBuilder;
import java.util.*;


public class strCovertIntoiinteger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String :");
        String s= sc.nextLine();
        int n=s.length();
        if(n>=10){
            System.out.println("Size is greater than 10");
            return;
        }
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            int asc=(int)(ch);
            System.out.print(asc+" ");
        }
    }
    
}

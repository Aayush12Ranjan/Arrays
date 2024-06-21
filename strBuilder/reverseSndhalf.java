package strBuilder;

import java.util.*;
public class reverseSndhalf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the even String:");
        StringBuilder s= new StringBuilder(sc.nextLine());

        
        int n=s.length();

       
        if(n%2!=0) {
            System.out.println("String not have even size");
            return;
        }

        int mid=n/2;
        int i=mid;
        int j=n-1;

        while(i<j){
            char temp=s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, temp);
            i++;
            j--;
        }

        System.out.print(s+" ");
    }
    
}

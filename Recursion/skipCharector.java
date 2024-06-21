package Recursion;

public class skipCharector {
    static void print(int idx, String s){
        if(idx==s.length()) return;
         if(s.charAt(idx)!='a' && s.charAt(idx)!='A') System.out.print(s.charAt(idx));
         print(idx+1, s);
    }
    public static void main(String[] args) {
        String s="Aayush Ranjan";
        print(0, s);
    }
    
}

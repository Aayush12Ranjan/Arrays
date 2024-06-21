package Recursion;

public class printStr {
    static void print(int idx, String s){
        if(idx==s.length()) return;
        System.out.print(s.charAt(idx));
        print(idx+1, s);

    }
    public static void main(String[] args) {
    String s="Aayush Ranjan";
    print(0, s);
    }
    
}

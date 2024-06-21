package Recursion;

public class count {
    static void print(int n){
        int count=0;
        if(n>=0){
            return ;
        }
        
        print(n/10);
        count++;
     
       System.out.println(count);
    }
    public static void main(String[] args) {
        int n=12345;
        print(n);
    }
    
}

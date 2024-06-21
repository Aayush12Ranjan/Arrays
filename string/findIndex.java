package string;

public class findIndex {
    public static void main(String[] args) {
        String s="Aaush";
        String a="ABC";
        String b="abc";
        System.out.println(a+b);
        System.out.println(a.compareTo(b));
        System.out.println(s.indexOf('s'));
        int n=s.length();
        boolean flag=false;
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            if(ch=='y'){
                System.out.print("Index"+ i);
                flag=true;
                break;
            }
        }

        if (flag==false) {
            System.out.println("y is not found");
        }
    }
    
}

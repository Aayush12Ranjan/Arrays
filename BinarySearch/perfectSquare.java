package BinarySearch;

public class perfectSquare {
    static void square(int n){
        int lo=1;
        int hi=n;
        boolean flag=false;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            long sqr=(long)mid*mid;
            if(sqr==n) {
                flag=true;
                break;
            }
            else if(sqr>n) hi=mid-1;
            else lo=mid+1;
        }
        if(flag==true){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        int n=34;
        square(n);
    }
    
}

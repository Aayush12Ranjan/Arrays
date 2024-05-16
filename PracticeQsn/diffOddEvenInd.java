package PracticeQsn;
import java.util.*;
public class diffOddEvenInd {
    static void Diffrence(int arr[]){
        int n= arr.length;
        int sum1=0; int sum2=0;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                sum1+=i;
            }
            else{
                sum2+=i;
            }
        }
        int diff=sum1-sum2;
        System.out.println("Difference:"+ diff);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sizr of array");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the array item");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Diffrence(arr);
    }
    
}

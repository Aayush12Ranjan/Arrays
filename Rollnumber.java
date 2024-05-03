import java.util.*;

public class Rollnumber{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the array item");
        for(int i=1; i<=n; i++){
            arr[i]= sc.nextInt();
        }
        for(int i=1; i<=n; i++){
            if(arr[i]<35){
                System.out.println(i);
            }
        }
    }
}
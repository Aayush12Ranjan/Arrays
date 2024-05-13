import java.util.*;


public class TwoSum {

    static void Method(int arr[],int target){
        int n=arr.length;
        boolean flag=false;
    for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            if((arr[i]+arr[j])==target){
                flag=true;
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }

    if(flag==false) System.out.println("no any pair of targer sum present");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int arr[]= new int[n];
        n=arr.length;
        System.out.println("Enter the items");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Target");
        int target=sc.nextInt();


        Method(arr,target);
    }

   
}

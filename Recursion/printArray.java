package Recursion;

public class printArray {
    static int print(int arr[],int idx){
        int n=arr.length;
        if(idx==n) return n;
        System.out.print(arr[idx]+" ");
      

        return print(arr,idx+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        print(arr, 0);
    }
    
}

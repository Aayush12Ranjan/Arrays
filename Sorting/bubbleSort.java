package Sorting;

public class bubbleSort {

    static void print(int arr[]){
        int n=arr.length;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;

        for(int i=0; i<n-1; i++){
            boolean flag=true;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag==true) break;
        }
        print(arr);
    }
    
}

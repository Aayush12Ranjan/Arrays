package Sorting;

public class insertionSort {

    

    static void print(int arr[]){
        int n=arr.length;

        for(int Ele :arr){
            System.out.print(Ele+ " ");
        }
        System.out.println();
    }

    static void swap(int arr[],int i ,int j){
        int n=arr.length;

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[]={4,20,-3,-10,6,3,8};
        int n=arr.length;

        for(int i=1; i<n; i++){
            for(int j=i;j>=1; j--){
                if(arr[j]<arr[j-1])
                swap(arr, j, j-1);

                else break;
            }
        }
        print(arr);

    }
    
}

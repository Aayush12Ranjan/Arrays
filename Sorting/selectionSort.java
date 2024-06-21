package Sorting;

public class selectionSort {
    static void print(int arr[]){
        int n=arr.length;

        for(int Ele :arr){
            System.out.print(Ele+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,3,4,2,1};
        int n=arr.length;

        for(int i=0; i<n-1; i++){
            int min=Integer.MAX_VALUE;
            int mdx=-1;

            for(int j=i; j<n; j++){
                if(arr[j]<min){
                    min=arr[j];
                    mdx=j;
                }

                int temp=arr[i];
                arr[i]=arr[mdx];
                arr[mdx]=temp;
            }
        }
        print(arr);
    }
    
}

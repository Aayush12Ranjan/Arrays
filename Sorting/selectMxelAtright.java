package Sorting;

public class selectMxelAtright {

    
    static void print(int arr[]){
        int n=arr.length;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={10,5,8,3,-2,7};
        int n=arr.length;

        for(int i=0; i<n-1; i++){
            int mx=Integer.MIN_VALUE;
            int mdx=-1;

            for(int j=0; j<n-i; j++){
                if(arr[j]>mx){
                    mx=arr[j];
                    mdx=j;
                }
            }
                int temp=arr[n-1-i];
                arr[n-1-i]=arr[mdx];
                arr[mdx]=temp;
              
            
        }
        print(arr);
    }
    
}

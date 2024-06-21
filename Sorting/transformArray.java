package Sorting;

public class transformArray {

    static void print(int arr[]){
        int n=arr.length;

        for(int Ele :arr){
            System.out.print(Ele+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={10,40,20};
        int n=arr.length;

        int x=0;
        for(int i=0; i<n; i++){
            int min=Integer.MAX_VALUE;
            int mdx=-1;

           for(int j=0; j<n; j++){
            if(arr[j]<min && arr[j]>0)
            min=arr[j];
            mdx=j;
           }

           arr[mdx]=x;
           x--;
        }

        for(int i=0; i<n; i++){
          arr[i]*=-1;
        }

        print(arr);
    }
    
}

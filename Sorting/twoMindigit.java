package Sorting;

public class twoMindigit {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,};
        int n=arr.length;

        for(int i=0; i<n; i++){
            int min=Integer.MAX_VALUE;
            int mdx=-1;

            for(int j=0; j<n; j++){
                if(arr[j]<min)
                min=arr[j];
                mdx=j;
                if(i==2) break;
            }

           arr[mdx]=i;
        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    
}

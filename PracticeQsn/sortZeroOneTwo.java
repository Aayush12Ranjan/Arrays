package PracticeQsn;

public class sortZeroOneTwo {
    public static void main(String[] args) {
        // int arr[]={1,0,2,0,1,1,2,0,0,1};
        // int n=arr.length;

        // int noOfzero=0;
        // int noOfone=0;

        // for(int i=0; i<n; i++){
        //     if(arr[i]==0) noOfzero++;
        //     if(arr[i]==1) noOfone++;
        // }

        // for(int i=0; i<n; i++){
        //     if(i<=noOfzero) arr[i]=0;
        //     else if(i<noOfzero+noOfone) arr[i]=1;
        //     else arr[i]=2;

        //     System.out.print(arr[i]+" ");
        // }

        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int m=arr.length;
        int n=arr[0].length;

        for(int j=0; j<n; j++){
            System.out.println(arr[0][j]);
        }
    }
    
}

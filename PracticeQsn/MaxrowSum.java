package PracticeQsn;

public class MaxrowSum {
    static void maxRow(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        int mxSum=0;
        int index=-1;

        for(int i=0; i<m; i++){
            int currentSum=0;
            for(int j=0; j<n; j++){
                currentSum+=arr[i][j];

                if(currentSum>mxSum){
                    mxSum=currentSum;
                    index=i;
                }
            }
        }
        System.out.println("MaxSum:"+ mxSum +" index:"+ index);
    }
    public static void main(String[] args) {
        int arr[][]={{2,3,4,5,},{1,2,3,4},{1,0,2,1}};
          maxRow(arr);


        
    }
    
}

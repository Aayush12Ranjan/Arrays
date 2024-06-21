package PracticeQsn;

public class mxThreeProduct {
    public static void main(String[] args) {
        int arr[]={-100,-98,-1,2,3,4};
        int n=arr.length;
        
         
        if(n<3){
            System.out.println("Array have at least 3 size");
            return;

        }
        int mxProduct=Integer.MIN_VALUE;
        int currentProduct=0;

        for(int i=0; i<n-2; i++){
            currentProduct=arr[i]*arr[i+1]* arr[i+2];

            if(currentProduct> mxProduct){
                mxProduct=currentProduct;
            }
           

        }
        System.out.println(mxProduct+" ");
    }
    
}

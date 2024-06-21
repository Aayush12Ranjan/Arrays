package BinarySearch;

public class SearchTargetin2D {
    static void Search(int arr[][], int target){
        boolean flag=false;
        for(int i=1; i<arr.length; i++){
            int lo=i;
            int hi=arr.length-1;
           

            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                
                if(arr[i][mid]==target){
                    flag=true;
                    break;

                }
                else if(arr[i][mid]>target){
                    hi= mid-1;
                }
                else {
                    lo= mid+1;
                }
            }
           
           
        }
       if(flag==true){
        System.out.println("Element is available");
       }

       else{
        System.out.println("Element is not available");
       }
       
       
       

    }
    public static void main(String[] args) {
        int arr[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        Search(arr, 6);
    }
    
}

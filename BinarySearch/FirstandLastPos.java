package BinarySearch;

public class FirstandLastPos {
    static int[] Find(int arr[], int target){
        int ans[]={-1,-1};
        int n=arr.length;
        int lo=0; 
        int hi=n-1;
        int mid=lo+(hi-lo)/2;

        while(lo<=hi){
            if(arr[mid]>=target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
    
            ans=mid;
    
        }
    }
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
    }
    
}

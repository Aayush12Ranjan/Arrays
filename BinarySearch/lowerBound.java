package BinarySearch;

public class lowerBound {
    public static void main(String[] args) {
        int arr[]={10,23,46,46,97,97,140,264};
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        int target=58;
        int lb=n;

        while(lo<=hi){
           int mid=lo+(hi-lo)/2;
           if(arr[mid]>=target){
            lb=Math.min(lb, mid);
            hi=mid-1;
           }

           else{
            lo=mid+1;
           }
        }

        System.out.println(lb);
    }
    
}

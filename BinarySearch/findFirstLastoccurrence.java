package BinarySearch;

public class findFirstLastoccurrence {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,8,8,8,11,13};
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        boolean flag=false;
        int target=8;
        int ans[]={-1,-1};

        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){
                flag=true;
                break;
            }

            else if(arr[mid] > target) hi=mid-1;
            else if(arr[mid] < target) lo=mid+1;
        }

        if(flag==false){
            System.out.println("Target is not available");
            return;
        }
        lo=0;
        hi=n-1;
        int lb=n;

        while (lo<=hi) {
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=target){
                lb=mid;
                hi= mid-1;
            }
            else lo= mid+1;
            
        }
        ans[0]=lb;



        lo=0;
        hi=n-1;
        int ub=n;
        while (lo<=hi) {
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>target){
                ub=mid;
                hi= mid-1;
            }
            else lo= mid+1;
            
        }
        ans[1]=ub-1;



    }
    
}

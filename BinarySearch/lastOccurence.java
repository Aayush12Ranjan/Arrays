package BinarySearch;

public class lastOccurence {
    static int last(int arr[],int x){
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        int lastocur=-1;

        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==x){
                lastocur=mid;
                lo=mid+1;
            }

            else if(arr[mid] < x){
                lo=mid+1;
            }
            else hi=mid-1;
            
        }

        return lastocur;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,4,4,5};
        int n=arr.length;
        int target=4;
        int result=last(arr, target);

        System.out.println(result);
    }
    
}

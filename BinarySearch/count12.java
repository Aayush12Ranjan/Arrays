package BinarySearch;

public class count12 {
    static int Count(int arr[],int x){
        int n=arr.length;
        int lo=0; int hi=n-1;
        int count=0;

        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==x){
                count++;
                lo=mid+1;

            }

            else if(arr[mid]<x){
                lo=mid+1;
            }
            else hi=mid-1;
        }

        return count;
    }
    public static void main(String[] args) {
        int arr[]={0,0,0,0,1,1};

        int x=1;
        int result=Count(arr, x);
        System.out.println("Number of 1 is :" + result);
    }
    
}

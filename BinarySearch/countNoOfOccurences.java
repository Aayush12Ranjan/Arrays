package BinarySearch;

public class countNoOfOccurences {
    public static void main(String[] args) {
        int arr[]={10, 20, 20, 20,20,20,30,40,50};
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        int target=20;
        int count=0;
        
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;

            if(arr[mid]==target) count++;
            else if(arr[mid]>target) hi=mid-1;
            else if(arr[mid]<target) lo=mid+1;
        }

        System.out.println(count);
    }
    
}

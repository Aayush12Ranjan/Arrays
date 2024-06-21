package BinarySearch;

public class uniqueElement {
static int Find(int arr[]){
    int n=arr.length;
    int lo=0;
    int hi=n-1;
    int ans=-1;

    while(lo<=hi){
        int mid=lo+(hi-lo)/2;
        if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
            ans= arr[mid];
        }
        else if(arr[mid]>=arr[mid-1] && mid>=0){
            hi=mid-1;

        }

        else if(arr[mid]<=arr[mid+1] && mid<=n-1){
            lo=mid+1;
        }
    }
    return ans;

}
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,5,5,6,6};
        int n=arr.length;
     
        int result=Find(arr);

        System.out.println(result+" ");
    }
    
}

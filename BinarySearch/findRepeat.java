package BinarySearch;

public class findRepeat {
    static int repeat(int arr[]){
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==arr[mid-1] || arr[mid]==arr[mid+1]) return arr[mid];
            else if(arr[mid]<arr[mid+1]) lo=mid+1;
            else hi=mid-1;

        }
        return -1;
    }
    public static void main(String[] args) {
    
        int arr[]={1,2,3,3,4,5};
        int n=arr.length;
        int rep=repeat(arr);
        System.out.println("repeat number:" + rep);

}
    
}

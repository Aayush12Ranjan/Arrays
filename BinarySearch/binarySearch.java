package BinarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int arr[]={10,20,60,90,150,170,200};
        int n=arr.length;
        int low=0;
        int high=n-1;
        int target=17;
            
        boolean flag=false;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==target){
               flag=true; break;
            }

           else if(arr[mid]<target){
                low=mid+1;
            }

            else if(arr[mid]>mid){
                high=mid-1;
            }

           
        }

        if(flag==true){
            System.out.println("Target are Present");
        }
        else{
            System.out.println("Target are no present");
        }
    }
    
}

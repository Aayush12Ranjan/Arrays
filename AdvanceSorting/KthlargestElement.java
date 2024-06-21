package AdvanceSorting;

public class KthlargestElement {
    static int ans;
    public static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int partition(int arr[], int lo, int hi){
        int pivot=arr[lo];
        int pivotidx=lo;
        int count=0;
        for(int i=lo+1; i<=hi; i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int correctidx=count+ lo;
        swap(arr, correctidx, lo);

        int i=lo;;
        int j=hi;

        while(i < correctidx && j<correctidx ){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>=pivot) j--;
            else if(arr[i]>pivot && arr[j]< pivot){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return correctidx;

    }

     static void quickSort(int arr[], int lo, int hi, int k){
        if(lo>hi) return;
        if(lo==hi){
            ans+=arr[lo];
            return;
        }


        int idx=partition(arr, lo, hi);
        if(idx==k-1){
            ans+=arr[idx];
            return;
        }

        else if(idx>k-1) quickSort(arr , lo, idx-1, k);
        else  quickSort(arr ,idx+1, hi, k);
    }
    public static void main(String[] args) {
        int arr[]={5,6,2,3,1,8,9};
        int n=arr.length;
       // ans=0;
        int k=2;
     
       quickSort(arr, 0, n-1, n-k+1);
       System.out.println(ans);
        
    }
    
}

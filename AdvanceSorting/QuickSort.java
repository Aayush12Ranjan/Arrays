package AdvanceSorting;

public class QuickSort {
    static void print(int arr[]){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void swap(int arr[],int i,int j){
       
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int arr[],int lo ,int hi){
       int pivot=arr[lo];
       int pivotidx=lo;
       int count=0;
       for(int i=lo+1; i<=hi; i++){
        if(arr[i]<=pivot){
            count++;

        }
       }

       int correctIdx=lo+count;
       swap(arr, pivotidx, correctIdx);
       int i=lo;
       int j=hi;

       while(i<correctIdx && j>correctIdx){
        if(arr[i]<=pivot)i++;
        else if(arr[j]>pivot) j--;
        else if(arr[i]>pivot && arr[j]<pivot){
            swap(arr, i, j);
            i++;
            j--;
        }

       }
       return correctIdx;
    }

    static void quickSort(int arr[],int lo, int hi){

       if(lo>=hi) return;

        int idx=partition(arr, lo, hi);
        quickSort(arr, lo, idx-1);
        quickSort(arr, idx+1, hi);
    }

    
    public static void main(String[] args) {
        int arr[]={8,9,2,1,5,0,2};
        int n=arr.length;
        print(arr);
        quickSort(arr, 0, n-1);
        print(arr);
    }
    
}

package AdvanceSorting;

public class MergeSort1 {
    static void print(int arr[]){
        for(int ele :arr){
System.out.print(ele+" ");
        }
        System.out.println();
    }

    static void Merge(int arr[],int b[],int c[]){
        
   
    int i=0;
   int j=0;
   int k=0;
   while(i<b.length && j<c.length){
    if(b[i]>=c[j]) arr[k++]=b[i++];
    else arr[k++]=c[j++];
   }
   while(i<b.length) arr[k++]=b[i++];
   while(j<c.length) arr[k++]=c[j++];
    }

    static void Mergesort(int arr[]){
        int n=arr.length;

        if(n<2) return;
        int a[]= new int[n/2];
        int b[]= new int[n-n/2];
        for(int i=0; i<n/2; i++){
            a[i]=arr[i];
        }

        for(int i=0; i<n-n/2; i++){
            b[i]=arr[i+n/2];
        }
        Mergesort(b);
        Mergesort(a);
       
        Merge(arr, a, b);
    }
    public static void main(String[] args) {
        int arr[]={100,20,45,56,67,78,48,10,5};
        print(arr);
        Mergesort(arr);
        print(arr);
    

      
       
    }
    
}

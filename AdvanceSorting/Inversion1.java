package AdvanceSorting;

public class Inversion1 {
    
    static int count;
    static void  print(int arr[]){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void Inversion( int a[], int []b){
        int i=0;
        int j=0;
          while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                count+=(a.length-1);
                j++;

            }
            else{
                i++;
            }
          }
    }
    public static void Merge(int arr[],int a[],int b[]){
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) arr[k++]=a[i++];
            else arr[k++]=b[j++];
        }

        while(i<a.length) arr[k++]=a[i++];
          while(j<b.length) arr[k++]=b[j++];
    }

    public static void MergeSort(int arr[]){
        int n=arr.length;

        if(n==1) return;
        int a[]=new int[n/2];
        int b[]=new int[n-n/2];

        for(int i=0; i<n/2; i++){
            a[i]=arr[i];
        }

          for(int i=0; i<n-n/2; i++){
            b[i]=arr[i+n/2];
        }

        MergeSort(a);
        MergeSort(b);
        Inversion( a,b);

        Merge(arr, a,b);


     
    }
    public static void main(String[] args) {
        int arr[]={100,33,89,27,60,10,70};
        MergeSort(arr);
        print(arr);
        System.out.println(count);

        
    }
    
}

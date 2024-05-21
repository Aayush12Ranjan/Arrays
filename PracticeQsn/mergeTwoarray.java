package PracticeQsn;

public class mergeTwoarray {
    static void Merge(int arr1[],int arr2[]){
        int n1=arr1.length;
        int n2= arr2.length;
        int result[]= new int[n1+n2];
        int i=0;
        int j=0; 
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                result[k++]=arr1[i++];
            }
          else{
            result[k++]=arr2[j--];
          }
        }

        while(i<arr1.length){
            result[k++]=arr1[i++];
        }

        while(j<arr2.length){
            result[k++]=arr2[j++];
        }

        for(int l=0; l<n1+n2; l++){
            System.out.print(result[l]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[]={2,3,4,6};
        int arr2[]={7,8,9,11};

        Merge(arr1, arr2);
    }
    
}

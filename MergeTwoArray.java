public class MergeTwoArray {
    public static void main(String[] args) {
        int arr1[]={11,33,42,71};
        int n1=arr1.length;
       
        int arr2[]={26,56,69,76,89};
        int n2= arr2.length;
        int result[]=new int[n1+n2];
        
        int i=0;
        int j=0;
        int k=0;

       while(i<arr1.length && j<arr2.length){
        if(arr1[i]<arr2[j]){
            result[k]=arr1[i];
            i++;
            k++;
        }
        else{
            result[k]=arr2[j];
            j++;
            k++;
        }

        }
    

        while (i<arr1.length) {
            result[k++]=arr1[i++];
            
        }

        while(j<arr2.length){
            result[k++]=arr2[j++];
        }
 

    for (int m = 0; m<k; m++) {
        System.out.print(result[m] + " ");
    }
    System.out.println();
}
}
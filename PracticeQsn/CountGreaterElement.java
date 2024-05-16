package PracticeQsn;

public class CountGreaterElement {
    public static void main(String[] args) {
        int arr[]={5,6,7,8,2,9};
        int n= arr.length;
        int count=0;
        for(int i=0; i<n; i++){
         if(arr[i]>2){
           count++;
         }
        }
        System.out.println(count);
    }
    
}

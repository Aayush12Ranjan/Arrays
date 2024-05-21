package PracticeQsn;

public class kthLarge {
    public static void main(String[] args) {
        int arr[]={7,10,4,3,20,15};
        int n=arr.length;
        int k=4;

        int mx=Integer.MIN_VALUE;
        for(int i=0; i<k; i++){
           if(arr[i]>mx){
            mx=arr[i];
           }
          
        }
        System.out.println(mx);

       
    }
    
}

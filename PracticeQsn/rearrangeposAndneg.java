package PracticeQsn;

public class rearrangeposAndneg {
    public static void main(String[] args) {
        int arr[]={1,3,-4,-6,-7,8,9,-10};
        int n=arr.length;
        int ans[]= new int[n];
        int pos=0;
        int neg=1;
       

       for(int i=0; i<n; i++){
            if(pos<n && arr[i]>=0){
            ans[pos]=arr[i];
            pos+=2;
           
            }
            else if(neg<n && arr[i]<0){
                ans[neg]=arr[i];
                neg+=2;
               
            }
          
        }
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
       

      
    }
    
}

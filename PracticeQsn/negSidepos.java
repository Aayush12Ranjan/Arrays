package PracticeQsn;

public class negSidepos {
    public static void main(String[] args) {
        int arr[]={-1,4,9,-5,-6,8,2,-7};
        int n=arr.length;

        int posidx=n-1;
        int negidx=0;
        int ans[]= new int[n];

        for(int i=0; i<n; i++){
            if(arr[i]>=0){
              ans[posidx--]=arr[i];
               
            }
            else { 
                ans[negidx++]=arr[i];
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
        }
    }
    


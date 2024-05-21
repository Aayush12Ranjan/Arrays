package PracticeQsn;

public class subarrayWithzeroSum {
    static boolean Sumzero(int arr[]){
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if((arr[i]+arr[j])!=0)
                return false;

            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={3,2,-3,1,6};
        if(Sumzero(arr)){
            System.out.println("true");
        }

        else{
          System.out.println("false");
        }
    }
    
}

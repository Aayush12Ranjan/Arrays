package PracticeQsn;

public class printBothdiagonal {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int m=arr.length;
        int n=arr[0].length;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j] || arr[i]==arr[n-j-1]){
                    System.out.print(arr[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
          System.out.println();
          
        }
    }
    
}

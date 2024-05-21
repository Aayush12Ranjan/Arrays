package PracticeQsn;

public class Transpse {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int m=arr.length;
        int n=arr[0].length;
        int trans[][]= new int[n][m];

        // for(int i=0; i<m; i++){
        //     for(int j=i+1; j<n; j++){
        //         int temp=arr[i][j];
        //         arr[i][j]=arr[j][i];
        //         arr[j][i]=temp;

               
        //     }
           
        // }


        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                trans[i][j]=arr[j][i];
                
            }
        }

        int a=0;
        int b=m-1;

        for(int i=0; i<m; i++){
        
                int temp=trans[i][a];
                trans[i][a]=trans[i][b];
                trans[i][b]=temp;
            
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
               System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }



    }
    
}

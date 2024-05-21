package PracticeQsn;

public class sumofArray {
    public static void main(String[] args) {
        int [][]a={{1,2,3},{4,5,6}};
        int [][]b={{1,2,3},{4,5,6}};
       

        for(int i=0; i<2;i++){
            for(int j=0; j<=2; j++){
                a[i][j]+=b[i][j];
            }
        }

        for(int i=0; i<2; i++){
            for(int j=0; j<=2; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}

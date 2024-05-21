package PracticeQsn;

public class array {
    public static void main(String[] args) {
        int arr[][]={{1,80},{2,90},{3,90},{4,96}};
        for(int[] elem: arr){
            for(int x:elem){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    
}

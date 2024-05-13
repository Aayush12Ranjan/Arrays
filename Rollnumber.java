import java.util.*;

public class Rollnumber{
    public static void main(String[] args) {
        int arr[]={21,35,67,89,45,78,23,24,27};
        for(int i=0; i<arr.length;i++){
            if(arr[i]<35){
                System.out.println(i);
            }
        }
    }
}
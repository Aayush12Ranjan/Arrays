package Sorting;

public class strSorting {
    public static void main(String[] args) {
        String[]arr={"b","c", "t", "g", "s", "k"};

        int n=arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=0;j<n-1-i; j++){
               if(arr[j].compareTo(arr[j+1])> 0){
                  String temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
               }
            }
        }

        for(String ele : arr){
            System.out.print(ele+" ");
        }
    }
    
}

package PracticeQsn;

public class antiClockspiralMatrix {

        public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m=arr.length;
        int n=arr[0].length;
        

        int minr=0;
        int mxr=m-1;
        int minc=0;
         int mxc=n-1;

    while(minr <= mxr &&  minc <=mxc){

        for(int i=minr; i<=mxr;i++){
            System.out.print(arr[i][minc]+" ");
        } 
        minc++;
       

       if(minc<=mxc){

        for(int j=minc; j<=mxc; j++){
            System.out.print(arr[mxr][j]+" ");
        } mxr--;
    }

         if(minr<=mxr){

        for(int i=mxr; i>=minr; i--){
            System.out.print(arr[i][mxc]+" ");
        } mxc--;
    }

        if(minc<=mxc){
        for(int j=mxc; j>=minc; j--){
            System.out.print(arr[minr][j]+" ");
        }minr++;

    }
        
    }
    }
    
}

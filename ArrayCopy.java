public class ArrayCopy {
    public static void main(String[] args) {
        int arr[]={10,30,40,60,78};

        for(int i:arr){
            System.out.println(i);

        }
        System.out.println();

        // int num[]=arr;
        // for(int i: num){
        //     System.out.println(i);
        // }
        // System.out.println();
        // num[0]=34;
        // System.out.println(arr[0]);

      int nums[]= new int[arr.length];

      for(int i=0; i<arr.length; i++){
nums[i]=arr[i];
nums[0]=23;
System.out.println(nums[i]);
      }
    }
   

    
}

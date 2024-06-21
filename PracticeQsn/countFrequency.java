package PracticeQsn;

public class countFrequency {
    public static void main(String[] args) {
        int arr[]={10,20,10,30,30,20,40};
        int n=arr.length;
        boolean[] visited=new boolean[n];

        for(int i=0; i<n; i++){
            if(visited[i]==true){
                continue;
            }

            int count=1;

            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
}
    
}

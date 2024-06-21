package Recursion;

import java.util.ArrayList;

public class Arraysubset {
    static ArrayList<Integer>ans=new ArrayList<>();
    public static void subset(int arr[],int idx, int arr1[]){
        if(idx==arr.length){
           ans.add(arr1);
            return;
        }
        subset(arr, idx+1, arr1+idx);
        subset(arr, idx+1, arr1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
    }
    
}

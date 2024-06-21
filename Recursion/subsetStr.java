package Recursion;

import java.util.ArrayList;

public class subsetStr {
   static ArrayList<String>arr= new ArrayList<>();
    public static void subset(int idx,String s, String ans){
        if(idx==s.length()){
        arr.add(ans);
        return;

        }

        subset(idx+1, s, ans+s.charAt(idx));
        subset(idx+1,s,ans);

    }
    public static void main(String[] args) {
        String s="abcd";
        arr= new ArrayList<>();
        subset(0,s,"");
        System.out.println(arr);
    }
    
}

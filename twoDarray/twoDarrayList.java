package twoDarray;

import java.util.ArrayList;

public class twoDarrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>();
        a.add(10);
        a.add(5);
        a.add(13);
        a.add(14);

        ArrayList<Integer> b= new ArrayList<>();
        b.add(10);
        b.add(5);
        b.add(13);
        b.add(14);

        ArrayList<Integer> c= new ArrayList<>();
        c.add(10);
        c.add(5);
        c.add(13);
        c.add(14);


        ArrayList<ArrayList<Integer>>l= new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);


        for(int i=0;i<l.size(); i++){
            ArrayList<Integer>x=l.get(i);

            for(int j=0; j<x.size(); j++){
                System.out.print(x.get(j)+" ");
            }
            System.out.println();
        }
    }
    
}

package strBuilder;

public class StrCompression {
    public static void main(String[] args) {
        String ans="";
        String s="aaaabbbbccccdddeff";
    char arr[]=s.toCharArray();
        int n=s.length();
       
        int i=0;
        int j=0;

        while(j<n){
            if(arr[i]==arr[j]) j++;
            else{
               
                ans+=arr[i];
                int len=j-i;
                if(len>1)ans+=len;
                i=j;
            }
        }
        ans+=arr[i];
        int len=j-i;
        if(len>1)ans+=len;
           System.out.println(ans);
        }
    }
    


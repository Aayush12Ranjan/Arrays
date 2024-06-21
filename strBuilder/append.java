package strBuilder;

import javax.sound.sampled.SourceDataLine;

public class append {
    public static void main(String[] args) {
        
    
    StringBuilder sb= new StringBuilder("ABC");
    System.out.println(sb);
    
    String s="Aayush";
    sb.append(s);
    System.out.println(s);
    char[]ch={ 'a','b','d'};
    sb.append(ch);
    System.out.println(sb);
   
    }
}

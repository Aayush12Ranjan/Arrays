package Recursion;

public class Permutattion {
    static void permutation(String s, String ans){

        // Base case: if the input string is empty, print the answer string
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }

        // Iterate over the input string
        for(int i = 0; i < s.length(); i++){
            // Extract the i-th character
            char ch = s.charAt(i);

            // Extract the remaining characters
            String left = s.substring(0, i);
            String right = s.substring(i + 1);

            // Recursive call with the remaining characters and the current answer string
            permutation(left + right, ans + ch);
        }
    }

    public static void main(String[] args) {
        String s = "abcd";
        permutation(s, "");
    }
}

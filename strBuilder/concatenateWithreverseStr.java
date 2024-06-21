package strBuilder;

import java.util.*;

public class concatenateWithreverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        StringBuilder s = new StringBuilder(sc.nextLine());

        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
        }

        for (int i = 0; i < n / 2; i++) {
            char c = s.charAt(i);
            s.setCharAt(i, s.charAt(n - i - 1));
            s.setCharAt(n - i - 1, c); // Corrected this line
        }

        System.out.println(sb.toString() + s.toString());
    }
}

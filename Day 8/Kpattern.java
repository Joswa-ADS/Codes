import java.util.*;

public class Kpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();

        int j = len - 1;

        for (int i = 0; i < len; i++) {

            if (i == j) {
                // middle character (odd length)
                System.out.println(str.charAt(i));
            } else {
                System.out.print(str.charAt(i));

                int spaces = j - i - 1; 
                for (int k = 0; k < spaces; k++) {
                    System.out.print(" ");
                }

                System.out.println(str.charAt(j));
            }

            j--;
        }
    }
}
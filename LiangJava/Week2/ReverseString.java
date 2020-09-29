//ch. 5; 5.46
package Week2;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = input.nextLine();

        System.out.println("The reversed string is: " + reverseString(word));
    }

    static String reverseString(String string) {
        StringBuffer sb = new StringBuffer(string);
        String a = sb.reverse().toString();
        return a;
    }
}

//Chapter 2; 2.6
package Week1;

import java.util.Scanner;

public class MultiplyDigitsInNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int num = input.nextInt();

        System.out.println("The multiplication of all digits in " + num + " is " + multiplyDigits(num));
    }

    static int multiplyDigits(int num) {
        int d1 = num < 100 ? 1 : num / 100;
        int d2 = num < 10 ? 1 : (num % 100) / 10;
        int d3 = num < 1 ? 1 : num % 10;

        return d1 * d2 * d3;
    }
}

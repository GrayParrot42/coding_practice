//Chapter 2; 2.7
package Week1;

import java.util.Scanner;

public class NumOfYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of minutes: ");
        long numOfMin = input.nextLong();

        numOfYearsDays(numOfMin);
    }

    static void numOfYearsDays(long num) {
        final int MINUTES_PER_YEAR = 525_600;
        final int MINUTES_PER_DAY = 1_440;
        int years = 0;
        int days = 0;
        years = (int) (num / MINUTES_PER_YEAR);
        days = (int) (num % MINUTES_PER_YEAR) / MINUTES_PER_DAY;

        System.out.println(num + " minutes is approximately " + years + " years and " + days + " days");
    }
}
